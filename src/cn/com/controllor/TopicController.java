package cn.com.controllor;

import cn.com.bean.Topic;
import cn.com.service.TopicServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class TopicController {
    @Autowired
    TopicServce topicServce;
    @RequestMapping("/topicJsp/{id}")
    public String topicTeset(@PathVariable("id")Integer integer, Map map)
    {
        map.put("cid",integer);
        return "redirect:/topic";
    }
    @RequestMapping("/topic")
    public ModelAndView topicRelURL(){
        return new ModelAndView("topic");
    }
    @RequestMapping("/topic/{cid}")
    @ResponseBody
    public Topic getTopic(@PathVariable("cid") Integer integer){
        return topicServce.getOneTopic(integer);
    }
}
