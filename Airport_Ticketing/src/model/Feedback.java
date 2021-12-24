/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Feedback {
    private String id;
    private String ulasan;
    private int[] rating = new int[5];

    public Feedback() {
    }

    public Feedback(String id, String ulasan) {
        this.id = id;
        this.ulasan = ulasan;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUlasan() {
        return ulasan;
    }

    public void setUlasan(String ulasan) {
        this.ulasan = ulasan;
    }

    public int[] getRating() {
        return rating;
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }
    
    public void getFeedback(){
        
    }
    public void setFeedback(){
        
    }
    public void showFeedback(){
        
    }
}
