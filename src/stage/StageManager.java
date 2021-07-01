package stage;

import model.Stage;
/**
 * @author - Yung-Yi Chen
 */
public class StageManager{
    public static Stage getStage(String level){
        //TODO:
        switch(level){
            case "Easy":
                return new StageEasy();
            case "Hard":
                return new StageHard();
        }
        return null;
    }
}
