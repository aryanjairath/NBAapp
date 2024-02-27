package aryan.jairath.nbaapplication;

import com.google.gson.annotations.SerializedName;

public class PlayerNews {

    @SerializedName("NewsID")
    private int newsID;

    @SerializedName("Source")
    private String source;

    @SerializedName("Updated")
    private String updated;

    @SerializedName("TimeAgo")
    private String timeAgo;

    @SerializedName("Title")
    private String title;

    @SerializedName("Content")
    private String content;

    @SerializedName("Url")
    private String url;

    @SerializedName("TermsOfUse")
    private String termsOfUse;

    @SerializedName("Author")
    private String author;

    @SerializedName("Categories")
    private String categories;

    @SerializedName("PlayerID")
    private int playerID;

    @SerializedName("TeamID")
    private int teamID;

    @SerializedName("Team")
    private String team;

    @SerializedName("OriginalSource")
    private String originalSource;

    @SerializedName("OriginalSourceUrl")
    private String originalSourceUrl;

    public PlayerNews(int newsID, String source, String updated, String timeAgo, String title, String content, String url, String termsOfUse, String author, String categories, int playerID, int teamID, String team, String originalSource, String originalSourceUrl) {
        this.newsID = newsID;
        this.source = source;
        this.updated = updated;
        this.timeAgo = timeAgo;
        this.title = title;
        this.content = content;
        this.url = url;
        this.termsOfUse = termsOfUse;
        this.author = author;
        this.categories = categories;
        this.playerID = playerID;
        this.teamID = teamID;
        this.team = team;
        this.originalSource = originalSource;
        this.originalSourceUrl = originalSourceUrl;
    }

    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getTimeAgo() {
        return timeAgo;
    }

    public void setTimeAgo(String timeAgo) {
        this.timeAgo = timeAgo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getOriginalSource() {
        return originalSource;
    }

    public void setOriginalSource(String originalSource) {
        this.originalSource = originalSource;
    }

    public String getOriginalSourceUrl() {
        return originalSourceUrl;
    }

    public void setOriginalSourceUrl(String originalSourceUrl) {
        this.originalSourceUrl = originalSourceUrl;
    }

    @Override
    public String toString() {
        return "PlayerNews{" +
                "newsID=" + newsID +
                ", source='" + source + '\'' +
                ", updated='" + updated + '\'' +
                ", timeAgo='" + timeAgo + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", termsOfUse='" + termsOfUse + '\'' +
                ", author='" + author + '\'' +
                ", categories='" + categories + '\'' +
                ", playerID=" + playerID +
                ", teamID=" + teamID +
                ", team='" + team + '\'' +
                ", originalSource='" + originalSource + '\'' +
                ", originalSourceUrl='" + originalSourceUrl + '\'' +
                '}';
    }
}
