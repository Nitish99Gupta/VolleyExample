package nitish.nawada.volleyexample;

/**
 * Created by user on 30-01-2016.
 */
public class ImageRecord {

    private String url;
    private String title;

    public ImageRecord(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
