package com.desafiolatam.prueba4.models;

import java.io.Serializable;

public class Cover implements Serializable {

        private String height,cloudinary_id,width,url;


        public String getHeight ()
        {
            return height;
        }

        public void setHeight (String height)
        {
            this.height = height;
        }

        public String getCloudinary_id ()
        {
            return cloudinary_id;
        }

        public void setCloudinary_id (String cloudinary_id)
        {
            this.cloudinary_id = cloudinary_id;
        }

        public String getWidth ()
        {
            return width;
        }

        public void setWidth (String width)
        {
            this.width = width;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }



}
