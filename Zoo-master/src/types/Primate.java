package types;

import animal_qualities.Walking;
import main.Animal;

public class Primate extends Animal implements Walking
    {
        public Primate()
        {
            super("Primate", "a lot of monkey types");

        } 
        public Primate(String name, String desc)
        {
            super(name, desc);
        }
        public String makeNoise()
        {
            return "hoots";
        }
        public String eat()
        {
            return "bananas";
        }
        public String walk() {return "runs and walks";}

    
    }