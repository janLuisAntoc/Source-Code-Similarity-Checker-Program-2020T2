package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class gridColorMaker {
    public Rectangle checkColor(float value) {
        Rectangle scoreRectangle = new Rectangle();

        scoreRectangle.setWidth(100);
        scoreRectangle.setHeight(50);

        if (value >= 0 && value <= 0.10) {
            scoreRectangle.setFill(Color.PURPLE);
        } else if (value > 0.10 && value <= 0.20) {
            scoreRectangle.setFill(Color.INDIGO);
        } else if (value > 0.20 && value <= 0.30) {
            scoreRectangle.setFill(Color.LIGHTBLUE);
        } else if (value > 0.30 && value <= 0.40) {
            scoreRectangle.setFill(Color.DARKBLUE);
        } else if (value > 0.40 && value <= 0.50) {
            scoreRectangle.setFill(Color.LIGHTGREEN);
        } else if (value > 0.50 && value <= 0.60) {
            scoreRectangle.setFill(Color.DARKGREEN);
        } else if (value > 0.60 && value <= 0.70) {
            scoreRectangle.setFill(Color.YELLOW);
        } else if (value > 0.70 && value <= 0.80) {
            scoreRectangle.setFill(Color.ORANGE);
        } else if (value > 0.80 && value <= 0.90) {
            scoreRectangle.setFill(Color.ORANGERED);
        } else {
            scoreRectangle.setFill(Color.RED);
        }

        return scoreRectangle;
    }
}