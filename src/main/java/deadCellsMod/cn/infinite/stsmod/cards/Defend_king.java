package deadCellsMod.cn.infinite.stsmod.cards;

import basemod.abstracts.CustomCard;
import com.megacrit.cardcrawl.actions.common.GainBlockAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import deadCellsMod.cn.infinite.stsmod.enums.AbstractCardEnum;

public class Defend_king extends DeadCellsCard {
    public static final String ID = "king:Defend";
    private static CardStrings strings = CardCrawlGame.languagePack.getCardStrings(ID);
    private static final String NAME = strings.NAME;
    private static final String IMG =  "img/card/defend.png";
    private static final String DESCRIPTION = strings.DESCRIPTION;
    private static final int COST = 1;
    private static final int UPGRADE_BLOCK = 3;
    public Defend_king(){
        super(ID,NAME,IMG,COST,DESCRIPTION,CardType.SKILL,
               /* CardColor.BLUE*/AbstractCardEnum.DEAD_CELLS,CardRarity.BASIC/*CardRarity.COMMON*/,CardTarget.SELF);


        this.baseBlock = 5;
        /*this.baseBlock = 996;*/
        this.tags.add(CardTags.STARTER_DEFEND);
    }

    @Override
    public void upgrade() {
        if (!this.upgraded) {
            this.upgradeBlock(UPGRADE_BLOCK);
            this.upgradeName();
        }
    }

    @Override
    public void use(AbstractPlayer paramAbstractPlayer, AbstractMonster paramAbstractMonster) {
        AbstractDungeon.actionManager.addToBottom(new GainBlockAction
                (paramAbstractPlayer, paramAbstractPlayer,this.block,true));
    }

    /*@Override
    public AbstractCard makeCopy(){
        AbstractCard card = new Defend_king();
        if (upgraded){
            card.upgrade();
        }
        return card;
    }*/
}
