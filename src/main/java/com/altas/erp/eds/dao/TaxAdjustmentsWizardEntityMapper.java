package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.TaxAdjustmentsWizardEntity;

public interface TaxAdjustmentsWizardEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax_adjustments_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax_adjustments_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(TaxAdjustmentsWizardEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax_adjustments_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(TaxAdjustmentsWizardEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax_adjustments_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    TaxAdjustmentsWizardEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax_adjustments_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(TaxAdjustmentsWizardEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax_adjustments_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TaxAdjustmentsWizardEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tax_adjustments_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(TaxAdjustmentsWizardEntity record);
}