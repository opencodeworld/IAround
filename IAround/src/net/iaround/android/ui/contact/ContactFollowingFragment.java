package net.iaround.android.ui.contact;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import net.iaround.android.BaseApplication;
import net.iaround.android.BaseFragment;
import com.minisea.example.R;

public class ContactFollowingFragment extends BaseFragment {

	public ContactFollowingFragment(BaseApplication application,
			Activity activity, Context context) {
		super(application, activity, context);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mView = inflater.inflate(R.layout.contact_following, container, false);
		findViewById();
		setListener();
		init();
		return mView;
	}

	@Override
	protected void findViewById() {

	}

	@Override
	protected void setListener() {

	}

	@Override
	protected void init() {

	}

}
