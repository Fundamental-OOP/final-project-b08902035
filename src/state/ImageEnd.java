package state;

import utils.ImageStateUtils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author - Leyna
 */
 
public class ImageEnd extends ImageState{
    public ImageEnd(String petName){
        this.totalDuration = 0;
        this.defaultAnimLength = defaultAnimLength;
        frames = new ArrayList<ImageFrame>();
        for(int i = 6; i <= 12; ++i){
            String path = "assets/"+ petName +"/jump/"+ petName +"_" + i + ".png";
            addFrame(ImageStateUtils.getImage(path), 5);
        }
    }
}