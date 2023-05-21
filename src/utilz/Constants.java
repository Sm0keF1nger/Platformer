package utilz;

public class Constants {
    public static class Directions{
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }
    public static  class  PlayerConstants {
        public static final int IDLE = 0;
        public static final int RUNNING = 2;
        public static final int JUMP = 9;
//        public static final int FALLING = 4;
 //       public static final int GROUND = 5;
        public static final int HIT = 6;
        public static final int ATTACK_1 = 3;
        public static final int ATTACK_2 = 4;
        public static final int ATTACK_3 = 5;

        public static int GetSpriteAmount(int player_action){
            switch(player_action){

                case RUNNING:
                    return 8;
                case IDLE:
                    return 6;
                case JUMP:
                    return 9;
                case HIT:
                    return 2;
                case ATTACK_1:
                    return 4;
                case ATTACK_2:
                    return 5;
                case ATTACK_3:
                    return 4;
                default:
                    return 1;

            }

        }
    }
}
