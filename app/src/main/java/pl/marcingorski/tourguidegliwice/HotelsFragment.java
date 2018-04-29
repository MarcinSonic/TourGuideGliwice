package pl.marcingorski.tourguidegliwice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of interesting hotels.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));
        places.add(new Place(getString( R.string.royal), getString( R.string.royal_adres), R.drawable.royal));


        // Create an {@link PlceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        // Set a click listener for the future
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Place} object at the given position the user clicked on
                Place place = places.get(position);
            }
        });

        return rootView;
    }
}