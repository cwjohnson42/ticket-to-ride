package deltamonstarz.tickettoride.views.gamePlay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import delta.monstarz.shared.GameInfo;
import delta.monstarz.shared.model.PlayerResult;
import deltamonstarz.tickettoride.R;
import deltamonstarz.tickettoride.model.ClientModel;
import deltamonstarz.tickettoride.presenters.GamePresenter;
import deltamonstarz.tickettoride.presenters.GameSelectorPresenter;
import deltamonstarz.tickettoride.views.GameSelectorActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GameResultsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GameResultsFragment extends Fragment {
	private TextView playerText;
	private Button startGameButton;
	private static GamePresenter presenter;
	private RecyclerView mRecyclerView;
	private LinearLayoutManager mLayoutManager;
	private List<PlayerResult> results;

	public GameResultsFragment() {
		// Required empty public constructor
	}

	public void setResults(List<PlayerResult> results) {
		this.results = results;
	}

	public static GameResultsFragment newInstance() {
		GameResultsFragment fragment = new GameResultsFragment();
		presenter = GamePresenter.getInstance();
		return fragment;
	}

//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_game_results);

		presenter = GamePresenter.getInstance();
		presenter.setActivity(this);

		mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

		// use this setting to improve performance if you know that changes
		// in content do not change the layout size of the RecyclerView
		mRecyclerView.setHasFixedSize(true);

		// use a linear layout manager
		mLayoutManager = new LinearLayoutManager(this);
		mRecyclerView.setLayoutManager(mLayoutManager);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View v = inflater.inflate(R.layout.fragment_game_results, container, false);
		playerText = (TextView) v.findViewById(R.id.playersText);
		startGameButton = (Button) v.findViewById(R.id.startGame);
		startGameButton.setEnabled(false);
		return v;
	}

	private class ResultHolder extends RecyclerView.ViewHolder {
		private TextView player;
		private TextView final_score;
		private TextView routes;
		private TextView finished_destinations;
		private TextView unfinished_destinations;

		private PlayerResult result;

		private View view;

		/**
		 * Initializes a result holder.
		 *
		 * @param v The view that belongs the recycler view.
		 */
		ResultHolder(View v) {
			super(v);
			view = v;

			player = (TextView) v.findViewById(R.id.player);
			final_score = (TextView) v.findViewById(R.id.final_score);
			routes = (TextView) v.findViewById(R.id.routes);
			finished_destinations = (TextView) v.findViewById(R.id.finished_destinations);
			unfinished_destinations = (TextView) v.findViewById(R.id.unfinished_destinations);
		}
	}

	private class GameResultsRecyclerAdapter extends RecyclerView.Adapter<ResultHolder>
	{
		private List<PlayerResult> resultList;

		public GameResultsRecyclerAdapter(List<PlayerResult> list) {
			resultList = list;
		}

		@Override
		public ResultHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			// create a new view
			View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_results_player_list_item, parent, false);
			// set the view's size, margins, padding and layout parameters
			GameResultsFragment.ResultHolder vh = new GameResultsFragment.ResultHolder(v);
			return vh;
		}

		@Override
		public void onBindViewHolder(final ResultHolder holder, int position) {
			holder.result = resultList.get(position);

			holder.player.setText(holder.result.getUsername());
			holder.final_score.setText(String.valueOf(holder.result.getScore()));
			holder.routes.setText(String.valueOf(holder.result.getRoute_score()));
			holder.finished_destinations.setText(String.valueOf(holder.result.getFinished_dests_score()));
			holder.unfinished_destinations.setText(String.valueOf(holder.result.getUnfinished_dests_score()));

		}

		@Override
		public int getItemCount() {
			return resultList.size();
		}
	}

}
