package com.iampushpendra.jsonwork.model;

/**
 * Created by Pushpendra Singh on 06-10-2017.
 */

public class Songs {


    public Songs() {
    }

    public Songs(String wrapperType, String kind, int artistId, int collectionId, int trackId, String artistName, String collectionName, String trackName, String collectionCensoredName, String trackCensoredName, String artistViewUrl, String collectionViewUrl, String trackViewUrl, String previewUrl, String artworkUrl30, String artworkUrl60, String artworkUrl100, int collectionPrice, int trackPrice, String releaseDate, String collectionExplicitness, String trackExplicitness, String discCount, int discNumber, int trackCount, int trackNumber, int trackTimeMillis, String country, String currency, String primaryGenreName, Boolean isStreamable) {
        this.wrapperType = wrapperType;
        this.kind = kind;
        this.artistId = artistId;
        this.collectionId = collectionId;
        this.trackId = trackId;
        this.artistName = artistName;
        this.collectionName = collectionName;
        this.trackName = trackName;
        this.collectionCensoredName = collectionCensoredName;
        this.trackCensoredName = trackCensoredName;
        this.artistViewUrl = artistViewUrl;
        this.collectionViewUrl = collectionViewUrl;
        this.trackViewUrl = trackViewUrl;
        this.previewUrl = previewUrl;
        this.artworkUrl30 = artworkUrl30;
        this.artworkUrl60 = artworkUrl60;
        this.artworkUrl100 = artworkUrl100;
        this.collectionPrice = collectionPrice;
        this.trackPrice = trackPrice;
        this.releaseDate = releaseDate;
        this.collectionExplicitness = collectionExplicitness;
        this.trackExplicitness = trackExplicitness;
        this.discCount = discCount;
        this.discNumber = discNumber;
        this.trackCount = trackCount;
        this.trackNumber = trackNumber;
        this.trackTimeMillis = trackTimeMillis;
        this.country = country;
        this.currency = currency;
        this.primaryGenreName = primaryGenreName;
        this.isStreamable = isStreamable;
    }

    String wrapperType;
    String kind;
    int artistId;
    int collectionId;
    int trackId;
    String artistName;
    String collectionName;
    String trackName;
    String collectionCensoredName;
    String trackCensoredName;
    String artistViewUrl;
    String collectionViewUrl;
    String trackViewUrl;
    String previewUrl;
    String artworkUrl30;
    String artworkUrl60;
    String artworkUrl100;
    int collectionPrice;
    int trackPrice;
    String releaseDate;
    String collectionExplicitness;
    String trackExplicitness;
    String discCount;
    int discNumber;
    int trackCount;
    int trackNumber;
    int trackTimeMillis;
    String country;
    String currency;
    String primaryGenreName;

    public Songs(String trackName, String artworkUrl30) {

    }

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public int getCollectionPrice() {
        return collectionPrice;
    }

    public void setCollectionPrice(int collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    public int getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(int trackPrice) {
        this.trackPrice = trackPrice;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    public String getDiscCount() {
        return discCount;
    }

    public void setDiscCount(String discCount) {
        this.discCount = discCount;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public void setTrackTimeMillis(int trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public Boolean getStreamable() {
        return isStreamable;
    }

    public void setStreamable(Boolean streamable) {
        isStreamable = streamable;
    }

    Boolean isStreamable;

}
