package me.shouheng.omnilist.activity.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import org.polaric.colorful.Colorful;
import org.polaric.colorful.ColorfulActivity;

import me.shouheng.omnilist.utils.ColorUtils;
import me.shouheng.omnilist.utils.ViewUtils;
import me.shouheng.omnilist.utils.preferences.ColorPreferences;

/**
 * Created by wang shouheng on 2017/12/21.*/
public abstract class ThemedActivity extends ColorfulActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        updateTheme();
    }

    protected boolean isDarkTheme() {
        return ColorUtils.isDarkTheme();
    }

    protected int primaryColor(){
        return ColorUtils.primaryColor();
    }

    protected int accentColor() {
        return ColorUtils.accentColor();
    }

    public void updateTheme() {
        Colorful.config(this)
                .primaryColor(ColorUtils.getThemeColor())
                .accentColor(ColorUtils.getAccentColor())
                .translucent(false)
                .dark(ColorPreferences.getInstance().isDarkTheme())
                .coloredNavigationBar(ColorPreferences.getInstance().isColoredNavigationBar())
                .apply();
        updateNavigationBar();
    }

    public void reUpdateTheme() {
        updateTheme();
        this.recreate();
    }

    public void updateNavigationBar() {
        if (ColorPreferences.getInstance().isColoredNavigationBar()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().setNavigationBarColor(ColorUtils.primaryColor());
            }
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().setNavigationBarColor(Color.BLACK);
            }
        }
    }

    public void setTranslucentStatusBar() {
        Window window = getWindow();
        ViewGroup mContentView = findViewById(Window.ID_ANDROID_CONTENT);
        // set child View not fill the system window
        View mChildView = mContentView.getChildAt(0);
        if (mChildView != null) {
            mChildView.setFitsSystemWindows(false);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            int statusBarHeight = ViewUtils.getStatusBarHeight(this);
            // First translucent status bar.
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                // After LOLLIPOP just set LayoutParams.
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                window.setStatusBarColor(Color.TRANSPARENT);
                // must call requestApplyInsets, otherwise it will have space in screen bottom
                if (mChildView != null) {
                    ViewCompat.requestApplyInsets(mChildView);
                }
            } else {
                ViewGroup mDecorView = (ViewGroup) window.getDecorView();
                if (mDecorView.getTag() != null && mDecorView.getTag() instanceof Boolean && (Boolean)mDecorView.getTag()) {
                    mChildView = mDecorView.getChildAt(0);
                    // remove fake status bar view.
                    mContentView.removeView(mChildView);
                    mChildView = mContentView.getChildAt(0);
                    if (mChildView != null) {
                        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) mChildView.getLayoutParams();
                        // cancel the margin top
                        if (lp != null && lp.topMargin >= statusBarHeight) {
                            lp.topMargin -= statusBarHeight;
                            mChildView.setLayoutParams(lp);
                        }
                    }
                    mDecorView.setTag(false);
                }
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void setStatusBarColor(int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(color);
        }
    }
}
