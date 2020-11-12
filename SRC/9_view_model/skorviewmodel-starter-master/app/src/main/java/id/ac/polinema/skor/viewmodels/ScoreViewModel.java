package id.ac.polinema.skor.viewmodels;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

import java.util.ArrayList;

import id.ac.polinema.skor.fragments.ScoreFragment;
import id.ac.polinema.skor.fragments.ScoreFragmentDirections;
import id.ac.polinema.skor.models.GoalScorer;

public class ScoreViewModel extends ViewModel {
    private final MutableLiveData<ArrayList<GoalScorer>> homeGoalScorerList =
            new MutableLiveData<>(new ArrayList<GoalScorer>());
    private final MutableLiveData<ArrayList<GoalScorer>> awayGoalScorerList =
            new MutableLiveData<>(new ArrayList<GoalScorer>());

    public int getHomeScore() {
        return homeGoalScorerList.getValue().size();
    }

    public int getAwayScore() {
        return awayGoalScorerList.getValue().size();
    }

    public void setGoalScorer(String team, GoalScorer goalScorer) {
        if (team.equals(ScoreFragment.HOME_REQUEST_KEY)) {
            homeGoalScorerList.getValue().add(goalScorer);
        } else {
            awayGoalScorerList.getValue().add(goalScorer);
        }
    }

    public void onAddHomeClick(View view) {
        ScoreFragmentDirections.GoalScorerAction action =
                ScoreFragmentDirections.goalScorerAction(ScoreFragment.HOME_REQUEST_KEY);
        Navigation.findNavController(view).navigate(action);
    }

    public void onAddAwayClick(View view) {
        ScoreFragmentDirections.GoalScorerAction action =
                ScoreFragmentDirections.goalScorerAction(ScoreFragment.AWAY_REQUEST_KEY);
        Navigation.findNavController(view).navigate(action);
    }
}

