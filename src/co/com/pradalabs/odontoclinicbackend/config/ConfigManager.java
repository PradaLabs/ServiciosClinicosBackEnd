package co.com.pradalabs.odontoclinicbackend.config;

import co.com.pradalabs.odontoclinicbackend.utils.ServletUtils;
//import com.google.apphosting.api.ApiProxy;


/**
 * A configuration manager.
 *
 */
public class ConfigManager {
  private static final String ERROR_MESSAGE_DATASTORE_INDEX_NOT_READY =
      "The datastore index is not yet ready to serve. Please wait a minute and try to "
      + "<a href=\"/\">reload</a>. For more information, see the "
      + "<a href=\"https://appengine.google.com/datastore/indexes?&app_id=%1$s\">"
      + "Datastore Indexes</a> page in the "
      + "<a href=\"http://appengine.google.com\">Admin Console.</a>";
  public static final int ERROR_CODE_UNKNOWN = -1;
  public static final int ERROR_CODE_DATASTORE_INDEX_NOT_READY = 1;
  private static final String PROP_NAME_CLOUD_STORAGE_BUCKET_NAME = "cloudStorageBucketName";
  private static final String PROP_NAME_ENTITY_MANAGER_FACTORY = "entityManagerFactory";
  private static final String PROP_NAME_CLOUD_SQL_CONNECTION_URL = "cloudSQLConnectionUrl";
  private static final String DEFAULT_ENTITY_MANAGER_FACTORY =
      "com.google.cloud.demo.model.nosql.DemoEntityManagerNoSqlFactory";

  /**
   * The Google Cloud Storage bucket name, where images are stored.
   */
  public String getGoogleStorageBucket() {
    return System.getProperty(PROP_NAME_CLOUD_STORAGE_BUCKET_NAME);
  }

  /**
   * The upload servlet URL.
   */
  public String getUploadHandlerUrl() {
    return "/upload";
  }

  /**
   * The image download servlet URL.
   */
  public String getDownloadHandlerUrl() {
    return "/download";
  }

  /**
   * The comment post URL.
   */
  public String getCommentPostUrl() {
    return "/post";
  }

  /**
   * The main web page URL.
   */
  public String getMainPageUrl() {
    return "/photofeed.jsp";
  }

  public String getErrorPageUrl(int code) {
    return "/error.jsp?" + ServletUtils.REQUEST_PARAM_NAME_CODE + "=" + code;
  }

  public String getErrorMessage(int code) {
    if (code == ERROR_CODE_DATASTORE_INDEX_NOT_READY) {
      return String.format(ERROR_MESSAGE_DATASTORE_INDEX_NOT_READY,
         "Error de aplicacion");
    }
    return "The application runs into internal error. "
        + "Please reload or report to the application owner.";
  }

  /**
   * The photo thumbnail size in number of pixels.
   */
  public int getPhotoThumbnailSizeInPixels() {
    return 30 * 30;
  }

  public int getPhotoDisplaySizeInPixels() {
    return 600 * 600;
  }

  /**
   * If the thumbnail is generated using cropping.
   */
  public boolean isPhotoThumbnailCrop() {
    return true;
  }

  /**
   * The entity manager factory class. Depending on which class is chosen, the application will use
   * either the NoSQL or Cloud SQL as the datstore for application data mode.
   *
   */
  public String getDemoEntityManagerFactory() {
    String factoryClass = System.getProperty(PROP_NAME_ENTITY_MANAGER_FACTORY);
    return factoryClass == null ? DEFAULT_ENTITY_MANAGER_FACTORY : factoryClass;
  }

  /**
   * Returns the database url.
   */
  public String getDatabaseUrl() {
    return System.getProperty(PROP_NAME_CLOUD_SQL_CONNECTION_URL);
  }
}
