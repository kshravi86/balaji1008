package com.haarman.listviewanimations;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import android.widget.*;
import android.content.*;

public class SeventeenthActivity18 extends Activity {

	String[] CHEESES = {

		"When the wind is behind you, run. Run very fast.",
		"Lessons from the Blind men and the elephant",
		"Quit Reading Fast. Read Slow.",
		"The Pursuit of Happiness",
		"How can I make my life simpler?",
		"The Pursuit of Truth",
		"What should we focus on learning in an age where almost all information is at your fingertips?",
		"Wisdom from a 2000 year old Tamil Poem",
		"Everyone has a Master",

		         "Answers must not be given. They should emerge from within the asker.",
		 "What are middle-class values?",
		 "What's the best approach to starting a new religion?",
	
		 
		 
		 /*"If there were ten commandments in Indian politics, what would they be?",
		 "If companies were to be totally honest, how would they advertise their products?",
		 "Popular Culture: Is there any nation more obsessed with celebrities than the USA?",
		 "If Indian Cricketers were Politicians",
		 "Sad, Skewed View of History.",
		 "3 Types of Nations",
		 "Economies and Little Kids.",
		 "An Ignorant Leader is Worse Than an Evil Leader",
		 "What are the main/fundamental ideas in science?",
		 "Why aren't there a significant number of scientists as opposed to musicians and actors in TIME Magazine's The 100 Most Influential People in the World: Readers Poll?",
		 "A Trivial Pursuit",
		 "The Purpose of History",
		 "What relevance does 'history' hold, in the current world led by science and technology?",
		 "Random thought: RAM people and DVD people",
		 "Great minds discuss ideas Average minds discuss events. Small minds discuss people.?",
		 "Lasting Fame",
		 "How does the Indian concept of individuality differ from its Western counterpart?"
		 */
    };

	private static final String TAG = "NoBoringActionBarActivity";
    private int mActionBarTitleColor;
    private int mActionBarHeight;
    private int mHeaderHeight;
    private int mMinHeaderTranslation;
    private ListView mListView;
    private KenBurnsView mHeaderPicture;
    private ImageView mHeaderLogo;
    private View mHeader;
    private View mPlaceHolderView;
    private AccelerateDecelerateInterpolator mSmoothInterpolator;

    private RectF mRect1 = new RectF();
    private RectF mRect2 = new RectF();

    private AlphaForegroundColorSpan mAlphaForegroundColorSpan;
    private SpannableString mSpannableString;

    private TypedValue mTypedValue = new TypedValue();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSmoothInterpolator = new AccelerateDecelerateInterpolator();
        mHeaderHeight = getResources().getDimensionPixelSize(R.dimen.header_height);
        mMinHeaderTranslation = -mHeaderHeight + getActionBarHeight();

        setContentView(R.layout.activity_noboringactionbar);

        mListView = (ListView) findViewById(R.id.listview);


		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
										int position, long id) {

					switch( position )
					{
						case 1:  Intent newActivity = new Intent(SeventeenthActivity18.this, Seventeenth1.class);
							startActivity(newActivity);
							break;
						case 2:  Intent newActivity2 = new Intent(SeventeenthActivity18.this, Seventeenth2.class);
							startActivity(newActivity2);
							break;
						case 3:  Intent newActivity3 = new Intent(SeventeenthActivity18.this, Seventeenth3.class);
							startActivity(newActivity3);
							break;
						case 4:Intent newActivity4 = new Intent(SeventeenthActivity18.this, Seventeenth4.class);
							startActivity(newActivity4);
							break;
						case 5:Intent newActivity5 = new Intent(SeventeenthActivity18.this, Seventeenth5.class);
							startActivity(newActivity5);
							break;
						case 6:Intent newActivity6 = new Intent(SeventeenthActivity18.this, Seventeenth6.class);
							startActivity(newActivity6);
							break;
						case 7:Intent newActivity7 = new Intent(SeventeenthActivity18.this, Seventeenth7.class);
							startActivity(newActivity7);
							break;
						case 8:Intent newActivity8 = new Intent(SeventeenthActivity18.this, Seventeenth8.class);
							startActivity(newActivity8);
							break;
						case 9:Intent newActivity9 = new Intent(SeventeenthActivity18.this, Seventeenth9.class);
							startActivity(newActivity9);
							break;

						case 10:Intent newActivity10 = new Intent(SeventeenthActivity18.this, Seventeenth10.class);
							startActivity(newActivity10);
							break;
						case 11:Intent newActivity11 = new Intent(SeventeenthActivity18.this, Seventeenth11.class);
							startActivity(newActivity11);
							break;
						case 12:Intent newActivity12 = new Intent(SeventeenthActivity18.this, Seventeenth12.class);
							startActivity(newActivity12);
							break;
							
							
							
							
							
							
					}
				}
			});


        mHeader = findViewById(R.id.header);
        mHeaderPicture = (KenBurnsView) findViewById(R.id.header_picture);
        mHeaderPicture.setResourceIds(R.drawable.wisdom3, R.drawable.wisdom);
        mHeaderLogo = (ImageView) findViewById(R.id.header_logo);

        mActionBarTitleColor = getResources().getColor(R.color.actionbar_title_color);

        mSpannableString = new SpannableString(getString(R.string.noboringactionbar_title));
        mAlphaForegroundColorSpan = new AlphaForegroundColorSpan(mActionBarTitleColor);

        setupActionBar();
        setupListView();
    }

    private void setupListView() {
        ArrayList<String> FAKES = new ArrayList<String>();
		for (int i = 0; i < 12; i++) {
            FAKES.add(CHEESES[i]);
        }
        mPlaceHolderView = getLayoutInflater().inflate(R.layout.view_header_placeholder, mListView, false);
        mListView.addHeaderView(mPlaceHolderView);
        mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, FAKES));
        mListView.setOnScrollListener(new AbsListView.OnScrollListener() {
				@Override
				public void onScrollStateChanged(AbsListView view, int scrollState) {
				}

				@Override
				public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
					int scrollY = getScrollY();
					//sticky actionbar
					mHeader.setTranslationY(Math.max(-scrollY, mMinHeaderTranslation));
					//header_logo --> actionbar icon
					float ratio = clamp(mHeader.getTranslationY() / mMinHeaderTranslation, 0.0f, 1.0f);
					interpolate(mHeaderLogo, getActionBarIconView(), mSmoothInterpolator.getInterpolation(ratio));
					//actionbar title alpha
					//getActionBarTitleView().setAlpha(clamp(5.0F * ratio - 4.0F, 0.0F, 1.0F));
					//---------------------------------
					//better way thanks to @cyrilmottier
					setTitleAlpha(clamp(5.0F * ratio - 4.0F, 0.0F, 1.0F));
				}
			});
    }

    private void setTitleAlpha(float alpha) {
        mAlphaForegroundColorSpan.setAlpha(alpha);
        mSpannableString.setSpan(mAlphaForegroundColorSpan, 0, mSpannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getActionBar().setTitle(mSpannableString);
    }

    public static float clamp(float value, float min, float max) {
        return Math.max(min,Math.min(value, max));
    }

    private void interpolate(View view1, View view2, float interpolation) {
        getOnScreenRect(mRect1, view1);
        getOnScreenRect(mRect2, view2);

        float scaleX = 1.0F + interpolation * (mRect2.width() / mRect1.width() - 1.0F);
        float scaleY = 1.0F + interpolation * (mRect2.height() / mRect1.height() - 1.0F);
        float translationX = 0.5F * (interpolation * (mRect2.left + mRect2.right - mRect1.left - mRect1.right));
        float translationY = 0.5F * (interpolation * (mRect2.top + mRect2.bottom - mRect1.top - mRect1.bottom));

        view1.setTranslationX(translationX);
        view1.setTranslationY(translationY - mHeader.getTranslationY());
        view1.setScaleX(scaleX);
        view1.setScaleY(scaleY);
    }

    private RectF getOnScreenRect(RectF rect, View view) {
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        return rect;
    }

    public int getScrollY() {
        View c = mListView.getChildAt(0);
        if (c == null) {
            return 0;
        }

        int firstVisiblePosition = mListView.getFirstVisiblePosition();
        int top = c.getTop();

        int headerHeight = 0;
        if (firstVisiblePosition >= 1) {
            headerHeight = mPlaceHolderView.getHeight();
        }

        return -top + firstVisiblePosition * c.getHeight() + headerHeight;
    }

    private void setupActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setIcon(R.drawable.ic_transparent);

        //getActionBarTitleView().setAlpha(0f);
    }

    private ImageView getActionBarIconView() {
        return (ImageView) findViewById(android.R.id.home);
    }

    /*private TextView getActionBarTitleView() {
	 int id = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
	 return (TextView) findViewById(id);
	 }*/

    public int getActionBarHeight() {
        if (mActionBarHeight != 0) {
            return mActionBarHeight;
        }
        getTheme().resolveAttribute(android.R.attr.actionBarSize, mTypedValue, true);
        mActionBarHeight = TypedValue.complexToDimensionPixelSize(mTypedValue.data, getResources().getDisplayMetrics());
        return mActionBarHeight;
    }
}
