package com.haarman.listviewanimations;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Ninteenth2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

		textView.setText(   
			"It is best to see India as a country of countries. With close to a fifth of the world population, it is quite humungous & bewildering to see it like a regular country. Each of the 29 states are big enough to be a country. For instance, the largest state by population, Uttar Pradesh has more people than Russia, Canada and Australia put together. The state of Maharashtra is comparable to Mexico's population. State of Bihar is France, Netherlands, Greece, Belgium and Portugal put together. Understand the differences between our various states here: What state in India does what best?\n" +
			"\n" +
			"How did we end up with so many people? Here you go: Population: How can we explain the fact that 40 percent of the world lives in only two countries?\n" +
			"\n" +
			"History: India had the largest of Bronze Age civilizations along the Indus Valley. In the past 5000 years of civilizations plenty of interesting things happened. A quick summary of Indian history: How did the map of India change from 1 AD to the 20th century?\n" +
			"\n" +
			"Travel: India is among the top 4 most biologically diverse countries in the world that is from our unique geography [with lions, tigers, snow leopards and rhinos in natural habitat]. Then there is a huge architectural diversity caused from past riches. Then there is a massive cultural diversity from being a hub in the Indian Ocean. And then there is a culinary diversity. Get started exploring the travel wonders: Immersing in India: A Travel Book on India\n" +
			"\n" +
			"Celebrity Culture: Like the US, we are crazy about our films and celebrity. In fact, Bollywood [one of the 20 film industries in India] is the second biggest movie industry in the world. As I already mentioned, each state has its own movie industry. Bollywood just happens to be from the most prosperous state. Popular Culture: Is there any nation more obsessed with celebrities than the USA?\n" +
			"\n" +
			"Marriages & Weddings: Of course, outsiders are often confused by some of our unique customs on these. I mean, we still have arranged marriages as the primary institution. How do you make sense of it? Here you go: Marriage, Mango and the Monsoon: Quora book on Marriage in India \n" +
			"\n" +
			"Politics: We are a representative democracy like the US, but follow the UK's system of Parliament. Although our states have sufficient autonomy, we are a little less Federal than the US. Comparison of US & Indian political systems: What are the advantages and disadvantages of America's political party system over India's? If you want to understand even more about our parties, here you go: How can you explain all Indian Political parties in layman's terms?\n" +
			"\n" +
			"A quick summary of our politics since independence: What would be the summary of the politics of India from 1947 to today?\n" +
			"\n" +
			"Freedom movement: Indians are very proud of their freedom movement to have thrown out colonialism. Until 1870, India was a top 2 economy throughout history (pink bar below). \n" +
			"\n" +
			"How did we get colonized by the British despite being so huge? Here you go: How did the British colonize India?\n" +
			"\n" +
			"Look at how modern Indian evolved since then.\n" +
			"From Tryst to Tendulkar: The History of Independent India\n" +
			"\n" +
			"I have a few hundred more of these answers and if you want to go deeper, I can point you to them."
		);





	}
}
