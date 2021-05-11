import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public int themeParkCount(){
        return this.attractions.size() + this.stalls.size();
    }

    public void addReviewed(IReviewed reviewed) {
        this.reviewed.add(reviewed);
    }

    public ArrayList<IReviewed> getReviewed() {
        return reviewed;
    }


//    public ArrayList<IReviewed> getAllReviewed(){
//
//    }


    // ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed objects.
}
