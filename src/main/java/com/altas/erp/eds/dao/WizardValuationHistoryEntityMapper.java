package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.WizardValuationHistoryEntity;

public interface WizardValuationHistoryEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wizard_valuation_history
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wizard_valuation_history
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(WizardValuationHistoryEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wizard_valuation_history
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(WizardValuationHistoryEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wizard_valuation_history
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    WizardValuationHistoryEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wizard_valuation_history
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(WizardValuationHistoryEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wizard_valuation_history
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(WizardValuationHistoryEntity record);
}