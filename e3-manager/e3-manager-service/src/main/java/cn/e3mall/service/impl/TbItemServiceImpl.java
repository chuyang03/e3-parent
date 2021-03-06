package cn.e3mall.service.impl;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long ItemId) {

        TbItem tbItem = tbItemMapper.selectByPrimaryKey(ItemId);
/**
        TbItemExample example = new TbItemExample();
        //设置查询条件
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(ItemId);

        //执行查询
        List<TbItem> list = tbItemMapper.selectByExample(example);

        if (list!=null&&list.size()>0){

            return list.get(0);
        }

        return null;
 */

        return tbItem;
    }
}
