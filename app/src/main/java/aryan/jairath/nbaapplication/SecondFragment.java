package aryan.jairath.nbaapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aryan.jairath.nbaapplication.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        super.onCreate(savedInstanceState);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String [] tab = {"Player ID", "", "Status","","Team","","Position","","First Name", "", "Last Name", "", "Birth Date", "", "Height","","Weight",""};
        List<String> items = new ArrayList<>(Arrays.asList(tab)); //new ArrayList is only needed if you absolutely need an ArrayList
        GridView gridView = view.findViewById(R.id.results);
        TextAdapter adapter;
        if (getContext() != null) {
            adapter = new TextAdapter(getContext(), items);
            gridView.setAdapter(adapter);
        }
        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
        binding.buttonThird.setOnClickListener(v -> {
            String inputText = binding.playerInput.getText().toString().trim();
            if (!inputText.isEmpty()) {
                for (Player p : MainActivity.players) {
                    String playerName = p.getFirstName() + " " + p.getLastName();
                    if (inputText.equalsIgnoreCase(playerName)) {
                        ArrayList<String> cont = new ArrayList<>();
                        cont.add(p.getPlayerID()+"");
                        cont.add(p.getStatus());
                        cont.add(p.getTeam());
                        cont.add(p.getPosition());
                        cont.add(p.getFirstName());
                        cont.add(p.getLastName());
                        cont.add(p.getBirthDate());
                        cont.add(p.getHeight()+"");
                        cont.add(p.getWeight()+"");
                        int ind = 0;
                        for(int i =0; i< items.size(); i++){
                            if(items.get(i) == ""){
                                items.set(i, cont.get(ind));
                                ind++;
                            }

                        }
                        TextAdapter added = new TextAdapter(getContext(), items);
                        gridView.setAdapter(added);
                        break; // Exit the loop once a match is found
                    }
                }
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}