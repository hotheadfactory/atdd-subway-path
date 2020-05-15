package wooteco.subway.admin.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index() {
        return "service/index";
    }

    @GetMapping(value = "/search", produces = MediaType.TEXT_HTML_VALUE)
    public String searchPage() {
        return "service/search";
    }

    @GetMapping(value = "/map", produces = MediaType.TEXT_HTML_VALUE)
    public String mapPage() {
        return "service/map";
    }
}
