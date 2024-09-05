package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */

	    private String text;
	    private boolean isFeatured;
	    private int likes;

	    // Constructor
	    public WallPostImpl() {
	        this.text = "Undefined post";
	        this.isFeatured = false;
	        this.likes = 0;
	    }
	    

	    // Métodos de la interfaz WallPost (implementaciones)
	    @Override
	    public String getText() {
	        return this.text;
	    }

	    @Override
	    public void setText(String text) {
	        this.text = text;
	    }

	    @Override
	    public int getLikes() {
	        return likes;
	    }

	    @Override
	    public void like() {
	        likes++;
	    }
	    
	    /*Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
		 */
		
	    @Override
	    public void dislike() {
	        if (likes > 0) {
	            likes--;
	        }
	    }
	    @Override
	    public boolean isFeatured() {
	        return isFeatured;
	    }

	    @Override
	    public void toggleFeatured() {
	        this.isFeatured = !isFeatured;
	    }

	   
	    

	   
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
