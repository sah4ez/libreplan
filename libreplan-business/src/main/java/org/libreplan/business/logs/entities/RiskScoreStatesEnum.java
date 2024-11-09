package org.libreplan.business.logs.entities;
import static org.libreplan.business.i18n.I18nHelper.helperi18n;
/**
 * Defines ZERO, ONE, TWO, THREE, FOUR, SIX, NINE
 * to be used as data type in
 * {@link RiskLog}
 *
 * @author Misha Gozhda <misha@libreplan-enterprise.com>
 */
public enum RiskScoreStatesEnum {
    ZERO(helperi18n("0")), ONE(helperi18n("1")), TWO(helperi18n("2")), THREE(helperi18n("3")), FOUR(helperi18n("4")), SIX(helperi18n("6")), NINE(helperi18n("9")) ;

    private final String riskScoreStateEnum;

    RiskScoreStatesEnum(String riskScoreStateEnum) {
        this.riskScoreStateEnum = riskScoreStateEnum;
    }

    public  String getDisplayName() {
        return riskScoreStateEnum;
    }

    public static RiskScoreStatesEnum getDefault() {
        return RiskScoreStatesEnum.ZERO;
    }
}
