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
 
public class ImageRun extends ImageState{
    public ImageRun(String petName){
        this.totalDuration = 0;
        this.defaultAnimLength = defaultAnimLength;
        frames = new ArrayList<ImageFrame>();
        for(int i = 1; i <= 5; ++i){
            String path = "assets/"+ petName +"/run/"+ petName +"_" + i + ".png";
            addFrame(ImageStateUtils.getImage(path), 5);
        }
    }
}