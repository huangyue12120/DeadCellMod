package deadCellsMod.cn.infinite.stsmod.cards;

import com.megacrit.cardcrawl.cards.AbstractCard;
import deadCellsMod.cn.infinite.stsmod.enums.AbstractCardEnum;

public class Roll_ButNot extends Roll {
    public Roll_ButNot(){
        super("deadCells:Roll_ButNot","翻滚",CardRarity.SPECIAL,CardColor.COLORLESS);
    }

    /*@Override
    public AbstractCard makeCopy() {
        AbstractCard card = new Roll_ButNot();
        if (this.upgraded){
            card.upgrade();
        }
        return card;
    }*/
}
