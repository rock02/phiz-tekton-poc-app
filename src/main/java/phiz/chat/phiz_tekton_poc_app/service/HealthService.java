package phiz.chat.phiz_tekton_poc_app.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public String status() {
        return "UP";
    }
}
