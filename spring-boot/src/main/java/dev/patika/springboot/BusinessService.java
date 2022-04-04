package dev.patika.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Encoding;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BusinessService {


    private final CustomController customController;
    private CustomService customService;
    private CustomRepository customRepository;
    private CustomComponent customComponent;
    private Encoding encoding;


    public BusinessService(CustomController customController) {
        this.customController = customController;
    }

    @PostConstruct
    public void onInit() {
        customController.printMyName("Baran");
        customService.printMyName("Hazal");
        customRepository.printMyName("Ahmet");
        customComponent.printMyName("CustomComponent");
        encoding.getCharset();
    }

    @Autowired
    public void setCustomService(CustomService customService) {
        this.customService = customService;
    }

    @Autowired
    public void setCustomRepository(CustomRepository customRepository) {
        this.customRepository = customRepository;
    }

    @Autowired
    public void setCustomComponent(CustomComponent customComponent) {
        this.customComponent = customComponent;
    }

    @Autowired
    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }
}
