package me.shouheng.omnilist.config;

import me.shouheng.omnilist.BuildConfig;
import me.shouheng.omnilist.PalmApp;
import me.shouheng.omnilist.R;

/**
 * Created by shouh on 2018/4/8.*/
public class Constants {
    public static final String DEFAULT_LOG_TAG = "OmniList";

    // region Extras
    public final static String EXTRA_MODEL = "extra_model";
    public final static String EXTRA_CODE = "extra_code";
    public final static String EXTRA_REQUEST_CODE = "extra_request_code";
    public final static String EXTRA_FRAGMENT = "extra_fragment";
    public final static String EXTRA_IS_GOOGLE_NOW = "extra_is_from_google_now";

    public final static String VALUE_FRAGMENT_ASSIGNMENT = "value_fragment_assignment";

    public final static String EXTRA_ATTACHMENTS = "extra_attachments";
    public final static String EXTRA_MARKDOWN_CONTENT = "extra_markdown_content";
    public final static String VALUE_FRAGMENT_ASSIGNMENT_VIEWER = "value_assignment_viewer";

    public final static String ACTION_ADD_FROM_THIRD_PART = "action_add_from_third_part";
    // endregion

    // region Urls
    public final static String GOOGLE_PLAY_WEB_PAGE = "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID;
    public final static String MARKET_PAGE = "market://details?id=" + BuildConfig.APPLICATION_ID;
    public final static String GITHUB_PAGE = "https://github.com/Shouheng88/Omni-List";
    public final static String GITHUB_DEVELOPER = "https://github.com/Shouheng88";
    public final static String GOOGLE_PLUS_URL = "https://plus.google.com/communities/111484201678876118795";
    public final static String WEIBO_PAGE = "https://weibo.com/5401152113/profile?rightmod=1&wvr=6&mod=personinfo";
    public final static String TWITTER_PAGE = "https://twitter.com/ShouhengWang";
    public final static String WIKI = "https://github.com/Shouheng88/Omni-List";

    public final static String DEVELOPER_EMAIL = "shouheng2015@gmail.com";
    public final static String DEVELOPER_EMAIL_PREFIX = "【" + PalmApp.getStringCompact(R.string.app_name) +"|%s】";
    public final static String DEVELOPER_EMAIL_EMAIL_PREFIX = "\nEmail:";
    // endregion

    // region Attachment
    public final static String MIME_TYPE_IMAGE = "image/jpeg";
    public final static String MIME_TYPE_AUDIO = "audio/amr";
    public final static String MIME_TYPE_VIDEO = "video/mp4";
    public final static String MIME_TYPE_SKETCH = "image/png";
    public final static String MIME_TYPE_FILES = "file/*";
    public final static String MIME_TYPE_IMAGE_EXTENSION = ".jpeg";
    public final static String MIME_TYPE_AUDIO_EXTENSION = ".amr";
    public final static String MIME_TYPE_SKETCH_EXTENSION = ".png";
    public final static String MIME_TYPE_VIDEO_EXTENSION = ".mp4";

    public final static String VIDEO_MIME_TYPE = "video/*";
    public final static String SCHEME_HTTPS = "https";
    public final static String SCHEME_HTTP = "http";
    public final static String PDF_MIME_TYPE = "application/pdf";
    public final static String _3GP = ".3gp";
    public final static String _MP4 = ".mp4";
    public final static String _PDF = ".pdf";
    // endregion

    // region Action
    public final static String ACTION_SHORTCUT = "ACTION_SHORTCUT";
    public final static String ACTION_NOTIFICATION = "ACTION_NOTIFICATION";
    public final static String INTENT_GOOGLE_NOW = "com.google.android.gm.action.AUTO_SEND";
    public final static String ACTION_RESTART_APP = "action_restart_app";
    public final static String ACTION_DATA_SET_CHANGE_BROADCAST = "broadcast_action_data_set_changed";
    // endregion

    // region App Widgets
    public final static String INTENT_WIDGET = "widget_id";
    public final static String ACTION_WIDGET_LIST = "action_widget_list";
    public final static String ACTION_TAKE_PHOTO = "action_widget_take_photo";
    public final static String ACTION_ADD_SKETCH = "action_widget_add_sketch";
    public final static String ACTION_ADD_FILES = "action_widget_add_files";
    public final static String ACTION_ADD_RECORD = "action_widget_add_record";
    public final static String ACTION_ADD_ASSIGNMENT = "action_widget_add_assignment";
    public final static String ACTION_ADD_QUICK_ASSIGNMENT = "action_widget_add_quick_assignment";
    public final static String ACTION_CONFIG = "action_widget_config";
    public final static String EXTRA_CONFIG_SWITCH_ENABLE = "extra_widget_switch_enable";
    public final static String ACTION_WIDGET_LAUNCH_APP = "action_widget_launch_app";

    public final static String PREFS_NAME = BuildConfig.APPLICATION_ID + "_preferences";
    public final static String PREF_WIDGET_SQL_PREFIX = "widget_sql_";
    public final static String PREF_WIDGET_TYPE_PREFIX = "widget_type_";
    public final static String PREF_WIDGET_OVERDUE_PREFIX = "widget_is_overdue_";
    public final static String PREF_WIDGET_CATEGORY_CODE_PREFIX = "widget_category_code_";
    // endregion

    // region Alarm
    public final static String ACTION_ALARM_ALERT = BuildConfig.APPLICATION_ID +".alarm_alert";
    public final static String ACTION_ALARM_SNOOZE = BuildConfig.APPLICATION_ID +".alarm_snooze";
    public final static String ACTION_CANCEL_SNOOZE = BuildConfig.APPLICATION_ID +".action_cancel_snooze";
    public final static String ACTION_ALARM_DISMISS = BuildConfig.APPLICATION_ID +".alarm_dismiss";
    public final static String ACTION_POSTPONE_ALARM = BuildConfig.APPLICATION_ID + ".postpone_alarm";
    public final static String ACTION_CANCEL_NOTIFICATION = "AlarmAlertReceiver.ACTION_CANCEL_NOTIFICATION";
    public final static String ACTION_MARK_ASSIGNMENT_AS_DONE = BuildConfig.APPLICATION_ID + ".mark_assignment_as_done";
    public final static String EXTRA_NOTIFICATION_ID = "extra_name_notification_id";
    // endregion

    public final static int MAX_ASSIGNMENT_PROGRESS = 100;                                                                                                                                       

    public final static String REA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD0diKVSZ/U/KHuxZFYac3lLq7K\n" +
            "edqc+uOKSJgq26tgy4wmELCw8gJkempBm8NPf+uSOdWPlPLWijSf3W2KfzMMvZQ2\n" +
            "tfNQPQu+gXgdXuZC+fhqVqNgYtWVRMIspveSm3AK+52AxxzTlfAU1fpCEFOf4AHc\n" +
            "/E33toB493pf9gS2xwIDAQAB";

    public final static String BACKUP_DIR_NAME = "OmniList";
    public final static String FILES_BACKUP_DIR_NAME = "files";

    public final static String DEFAULT_USER_INFO_BG = "https://cdn1.tnwcdn.com/wp-content/blogs.dir/1/files/2014/06/wallpaper_51.jpg";
}
