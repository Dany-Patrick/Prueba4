package com.desafiolatam.prueba4.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Game implements Parcelable {

        private String summary,aggregated_rating,id,total_rating,name,updated_at,created_at,popularity,aggregated_rating_count,first_release_date,url,category,total_rating_count,slug;

        private String[] publishers,genres,platforms,tags,game_modes,games,keywords,developers,player_perspectives;

        private Release_dates[] release_dates;

        private Cover cover;

    protected Game(Parcel in) {
        summary = in.readString();
        aggregated_rating = in.readString();
        id = in.readString();
        total_rating = in.readString();
        name = in.readString();
        updated_at = in.readString();
        created_at = in.readString();
        popularity = in.readString();
        aggregated_rating_count = in.readString();
        first_release_date = in.readString();
        url = in.readString();
        category = in.readString();
        total_rating_count = in.readString();
        slug = in.readString();
        publishers = in.createStringArray();
        genres = in.createStringArray();
        platforms = in.createStringArray();
        tags = in.createStringArray();
        game_modes = in.createStringArray();
        games = in.createStringArray();
        keywords = in.createStringArray();
        developers = in.createStringArray();
        player_perspectives = in.createStringArray();
        cover = (Cover) in.readSerializable();
        release_dates = (Release_dates[]) in.readSerializable();
    }

    public static final Creator<Game> CREATOR = new Creator<Game>() {
        @Override
        public Game createFromParcel(Parcel in) {
            return new Game(in);
        }

        @Override
        public Game[] newArray(int size) {
            return new Game[size];
        }
    };

    public String getSummary ()
        {
            return summary;
        }

        public void setSummary (String summary)
        {
            this.summary = summary;
        }

        public String[] getPublishers ()
        {
            return publishers;
        }

        public void setPublishers (String[] publishers)
        {
            this.publishers = publishers;
        }

        public String[] getGenres ()
        {
            return genres;
        }

        public void setGenres (String[] genres)
        {
            this.genres = genres;
        }

        public String getAggregated_rating ()
        {
            return aggregated_rating;
        }

        public void setAggregated_rating (String aggregated_rating)
        {
            this.aggregated_rating = aggregated_rating;
        }

        public String[] getPlatforms ()
        {
            return platforms;
        }

        public void setPlatforms (String[] platforms)
        {
            this.platforms = platforms;
        }

        public Release_dates[] getRelease_dates ()
        {
            return release_dates;
        }

        public void setRelease_dates (Release_dates[] release_dates)
        {
            this.release_dates = release_dates;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public Cover getCover ()
        {
            return cover;
        }

        public void setCover (Cover cover)
        {
            this.cover = cover;
        }

        public String getTotal_rating ()
        {
            return total_rating;
        }

        public void setTotal_rating (String total_rating)
        {
            this.total_rating = total_rating;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getCreated_at ()
        {
            return created_at;
        }

        public void setCreated_at (String created_at)
        {
            this.created_at = created_at;
        }

        public String getPopularity ()
        {
            return popularity;
        }

        public void setPopularity (String popularity)
        {
            this.popularity = popularity;
        }

        public String[] getTags ()
        {
            return tags;
        }

        public void setTags (String[] tags)
        {
            this.tags = tags;
        }

        public String[] getGame_modes ()
        {
            return game_modes;
        }

        public void setGame_modes (String[] game_modes)
        {
            this.game_modes = game_modes;
        }

        public String[] getGames ()
        {
            return games;
        }

        public void setGames (String[] games)
        {
            this.games = games;
        }

        public String[] getKeywords ()
        {
            return keywords;
        }

        public void setKeywords (String[] keywords)
        {
            this.keywords = keywords;
        }

        public String getAggregated_rating_count ()
        {
            return aggregated_rating_count;
        }

        public void setAggregated_rating_count (String aggregated_rating_count)
        {
            this.aggregated_rating_count = aggregated_rating_count;
        }

        public String getFirst_release_date ()
        {
            return first_release_date;
        }

        public void setFirst_release_date (String first_release_date)
        {
            this.first_release_date = first_release_date;
        }

        public String[] getDevelopers ()
        {
            return developers;
        }

        public void setDevelopers (String[] developers)
        {
            this.developers = developers;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }

        public String getCategory ()
        {
            return category;
        }

        public void setCategory (String category)
        {
            this.category = category;
        }

        public String getUpdated_at ()
        {
            return updated_at;
        }

        public void setUpdated_at (String updated_at)
        {
            this.updated_at = updated_at;
        }

        public String[] getPlayer_perspectives ()
        {
            return player_perspectives;
        }

        public void setPlayer_perspectives (String[] player_perspectives)
        {
            this.player_perspectives = player_perspectives;
        }

        public String getTotal_rating_count ()
        {
            return total_rating_count;
        }

        public void setTotal_rating_count (String total_rating_count)
        {
            this.total_rating_count = total_rating_count;
        }

        public String getSlug ()
        {
            return slug;
        }

        public void setSlug (String slug)
        {
            this.slug = slug;
        }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(summary);
        dest.writeString(aggregated_rating);
        dest.writeString(id);
        dest.writeString(total_rating);
        dest.writeString(name);
        dest.writeString(updated_at);
        dest.writeString(created_at);
        dest.writeString(popularity);
        dest.writeString(aggregated_rating_count);
        dest.writeString(first_release_date);
        dest.writeString(url);
        dest.writeString(category);
        dest.writeString(total_rating_count);
        dest.writeString(slug);
        dest.writeStringArray(publishers);
        dest.writeStringArray(genres);
        dest.writeStringArray(platforms);
        dest.writeStringArray(tags);
        dest.writeStringArray(game_modes);
        dest.writeStringArray(games);
        dest.writeStringArray(keywords);
        dest.writeStringArray(developers);
        dest.writeStringArray(player_perspectives);
        dest.writeSerializable(cover);
        dest.writeSerializable(release_dates);
    }
}
