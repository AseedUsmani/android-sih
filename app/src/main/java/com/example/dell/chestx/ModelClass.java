package com.example.dell.chestx;

/**
 * Created by DELL on 31-Mar-18.
 */

public class ModelClass {
    private String disease, doc_id, image;

    public ModelClass(String disease, String doc_id) {
        this.disease = disease;
        this.doc_id = doc_id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
