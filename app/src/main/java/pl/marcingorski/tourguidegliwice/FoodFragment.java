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
 * {@link Fragment} that displays a list of interesting restaurants & bars.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString( R.string.zdrowa), getString( R.string.zdrowa_adres), R.drawable.burgery));
        places.add(new Place(getString( R.string.sushi), getString( R.string.sushi_adres), R.drawable.sushi));
        places.add(new Place(getString( R.string.mexico), getString( R.string.mexico_adres), R.drawable.mexico));
        places.add(new Place(getString( R.string.cafe), getString( R.string.cafe_adres), R.drawable.cafe));
        places.add(new Place(getString( R.string.zdrowa), getString( R.string.zdrowa_adres), R.drawable.burgery));
        places.add(new Place(getString( R.string.sushi), getString( R.string.sushi_adres), R.drawable.sushi));
        places.add(new Place(getString( R.string.mexico), getString( R.string.mexico_adres), R.drawable.mexico));
        places.add(new Place(getString( R.string.cafe), getString( R.string.cafe_adres), R.drawable.cafe));

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