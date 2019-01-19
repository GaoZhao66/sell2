package com.imooc.sell.utils;

import com.imooc.sell.Vo.ResultVo;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
public class ResultVoUtil {

    public static ResultVo success(Object object){
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVo success(){
        return success(null);
    }

    public static ResultVo error(Integer code,String msg){
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
