package com.desafiolatam.prueba4.models;

import java.io.Serializable;

public class Release_dates implements Serializable {

        private String platform,category,m,date,y,human;


        public String getPlatform ()
        {
            return platform;
        }

        public void setPlatform (String platform)
        {
            this.platform = platform;
        }

        public String getCategory ()
        {
            return category;
        }

        public void setCategory (String category)
        {
            this.category = category;
        }

        public String getM ()
        {
            return m;
        }

        public void setM (String m)
        {
            this.m = m;
        }

        public String getDate ()
        {
            return date;
        }

        public void setDate (String date)
        {
            this.date = date;
        }

        public String getY ()
        {
            return y;
        }

        public void setY (String y)
        {
            this.y = y;
        }

        public String getHuman ()
        {
            return human;
        }

        public void setHuman (String human)
        {
            this.human = human;
        }



}
