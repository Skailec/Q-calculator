package cn.qmai.discount.core.precompute;

import cn.qmai.discount.core.model.common.DiscountWrapper;
import cn.qmai.discount.core.model.goods.GoodsItem;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 预计算，把一些耗时操作放在Context中操作
 * @author: shiyafeng
 * @date: 2022/8
 */
public interface PreCompute<T extends GoodsItem> {

    /**
     * 判断符合条件的活动类型，符合才会执行preComputeItems
     */
    Set<String> matchTypes();

    /**
     * 对商品做一些复杂集合操作
     * @param items 当前参与优惠的商品
     * @param discount 当前优惠
     * @param preCompute 存储计算的结果
     */
     void preComputeItems(List<T> items, DiscountWrapper discount, Map<String,Object> preCompute);
}