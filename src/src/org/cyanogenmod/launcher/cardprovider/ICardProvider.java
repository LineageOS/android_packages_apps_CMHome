package org.cyanogenmod.launcher.cardprovider;

import android.content.Context;

import java.util.List;

import it.gmariotti.cardslib.library.internal.Card;

/**
 * An interface for classes that can manage data for and provide Cards to be displayed.
 */
public interface ICardProvider {
    public void onHide(Context context);
    public void onShow();
    public void requestRefresh();

    /**
     * Given a list of cards, update any card for which
     * there is new data available.
     * @param cards Cards to update
     * @return A list of cards that must be added
     */
    public List<Card> updateAndAddCards(List<Card> cards);
    public List<Card> getCards();
    public void addOnUpdateListener(CardProviderUpdateListener listener);

    public interface CardProviderUpdateListener {
        public void onCardProviderUpdate();
    }
}
