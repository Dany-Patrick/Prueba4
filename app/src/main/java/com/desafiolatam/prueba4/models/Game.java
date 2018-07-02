package com.desafiolatam.prueba4.models;

public class Game {
    private String name,slug,url,summary;
    private int id,created_at,updated_at,popularity,aggregated_rating,aggregated_rating_count,total_rating,total_rating_count,category,first_release_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreated_at() {
        return created_at;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public int getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(int updated_at) {
        this.updated_at = updated_at;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getAggregated_rating() {
        return aggregated_rating;
    }

    public void setAggregated_rating(int aggregated_rating) {
        this.aggregated_rating = aggregated_rating;
    }

    public int getAggregated_rating_count() {
        return aggregated_rating_count;
    }

    public void setAggregated_rating_count(int aggregated_rating_count) {
        this.aggregated_rating_count = aggregated_rating_count;
    }

    public int getTotal_rating() {
        return total_rating;
    }

    public void setTotal_rating(int total_rating) {
        this.total_rating = total_rating;
    }

    public int getTotal_rating_count() {
        return total_rating_count;
    }

    public void setTotal_rating_count(int total_rating_count) {
        this.total_rating_count = total_rating_count;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getFirst_release_date() {
        return first_release_date;
    }

    public void setFirst_release_date(int first_release_date) {
        this.first_release_date = first_release_date;
    }
}
