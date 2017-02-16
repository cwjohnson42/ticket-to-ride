package deltamonstarz.tickettoride.views;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import delta.monstarz.shared.GameInfo;
import deltamonstarz.tickettoride.ClientModel;
import deltamonstarz.tickettoride.R;
import deltamonstarz.tickettoride.presenters.GameSelectorPresenter;


public class GameSelectorActivity extends AppCompatActivity implements GameNameChoiceDialogFragment.OnCompleteListener
{
	//Widgets
	private Button mCreateGameButton;
	private Button mLogoutButton;
	private RecyclerView mRecyclerView;
	private LinearLayoutManager mLayoutManager;
	private GameSelectionRecyclerAdapter mAdapter;

	//Data Members
	private GameSelectorPresenter mPresenter;


	public static Intent newIntent(Context packageContext)
	{
		return new Intent(packageContext, GameSelectorActivity.class);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_selector);

		mPresenter = GameSelectorPresenter.getInstance();
		mPresenter.setActivity(this);

		mCreateGameButton = (Button) findViewById(R.id.createGameButton);
		mCreateGameButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				makeGameClick();
			}
		});

		mLogoutButton = (Button) findViewById(R.id.logoutButton);
		mLogoutButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				logout();
			}
		});

		mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

		// use this setting to improve performance if you know that changes
		// in content do not change the layout size of the RecyclerView
		mRecyclerView.setHasFixedSize(true);

		// use a linear layout manager
		mLayoutManager = new LinearLayoutManager(this);
		mRecyclerView.setLayoutManager(mLayoutManager);
	}

	@Override
	protected void onResume() {
		super.onResume();
		mPresenter.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
		mPresenter.onPause();
	}

	public void onGameListUpdate(List<GameInfo> infos) {

		//Set Adapter if null
		if(mRecyclerView.getAdapter() == null) {
			mAdapter = new GameSelectionRecyclerAdapter();
			mRecyclerView.setAdapter(mAdapter);
		}

		//Update list and notify
		mAdapter.getGameList().clear();
		mAdapter.getGameList().addAll(infos);
		mAdapter.notifyDataSetChanged();
	}

	public void logout() {
		Intent intent = new Intent(getBaseContext(), LoginActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent);
		finish();
	}

	public void onJoinGame() {
		Intent i = GameActivity.newIntent(GameSelectorActivity.this);
		startActivity(i);
	}

	private void makeGameClick(){
		FragmentManager manager = getSupportFragmentManager();
		GameNameChoiceDialogFragment dialog = new GameNameChoiceDialogFragment();
		dialog.show(manager, "choose_game_name__dialog");
	}
	public void onConnectionError() {
		Toast toast = Toast.makeText(this, "Network Error: Could not connect to server", Toast.LENGTH_LONG);
		toast.show();
	}

	@Override
	public void onComplete(String name) {
		mPresenter.createGame(name);
	}

	private class GameHolder extends RecyclerView.ViewHolder {
		public TextView gameName;
		public TextView gameOwner;
		public TextView gameStarted;
		public TextView playerCount;

		public GameInfo gameInfo;
		public View view;

		public GameHolder(View v) {
			super(v);
			view = v;

			gameName = (TextView) v.findViewById(R.id.nameText);
			gameOwner = (TextView) v.findViewById(R.id.ownerText);
			gameStarted = (TextView) v.findViewById(R.id.gameStarted);
			playerCount = (TextView) v.findViewById(R.id.playerCountText);

			v.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					GameSelectorPresenter.getInstance().joinGame(gameInfo.getGameID());
				}
			});
		}
	}

	private class GameSelectionRecyclerAdapter extends RecyclerView.Adapter<GameHolder>
	{
		private List<GameInfo> mGameList;

		public GameSelectionRecyclerAdapter() {
			mGameList = new ArrayList<>();
		}

		public List<GameInfo> getGameList() {
			return mGameList;
		}

		// Create new views (invoked by the layout manager)
		@Override
		public GameHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			// create a new view
			View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_selector_recycler_view, parent, false);
			// set the view's size, margins, padding and layout parameters
			GameHolder vh = new GameHolder(v);
			return vh;
		}

		// Replace the contents of a view (invoked by the layout manager)
		@Override
		public void onBindViewHolder(final GameHolder holder, int position) {
			holder.gameInfo = mGameList.get(position);

			holder.gameName.setText(holder.gameInfo.getName());
			holder.gameOwner.setText(holder.gameInfo.getOwnerName());
			holder.playerCount.setText(String.valueOf(holder.gameInfo.getPlayerCount()));

			// Has the game started?
			if (holder.gameInfo.isGameStarted()) {
				holder.gameStarted.setText("Yes (Rejoin)");
				holder.view.setBackgroundColor(getResources().getColor(R.color.greenButton));
			}
			// Is the player in a game that has not yet stared?
			else if (holder.gameInfo.getPlayers().contains(ClientModel.getInstance().getUsername())){
				holder.gameStarted.setText("No (Rejoin)");
			}
			else{
				holder.gameStarted.setText("No");
			}
		}

		// Return the size of your dataset (invoked by the layout manager)
		@Override
		public int getItemCount() {
			return mGameList.size();
		}
	}






















}
