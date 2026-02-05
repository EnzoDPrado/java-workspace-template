package study.lab.workspace;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class WorkspaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkspaceApplication.class, args);

        log.info("""
                             \s
                
                 _____________________________.___ _______    ________           __      __________ __________ ____  __.  ___________________  _____  _________ ___________
                 /   _____/\\______   \\______   \\   |\\      \\  /  _____/          /  \\    /  \\_____  \\\\______   \\    |/ _| /   _____/\\______   \\/  _  \\ \\_   ___ \\\\_   _____/
                 \\_____  \\  |     ___/|       _/   |/   |   \\/   \\  ___   ______ \\   \\/\\/   //   |   \\|       _/      <   \\_____  \\  |     ___/  /_\\  \\/    \\  \\/ |    __)_\s
                 /        \\ |    |    |    |   \\   /    |    \\    \\_\\  \\ /_____/  \\        //    |    \\    |   \\    |  \\  /        \\ |    |  /    |    \\     \\____|        \\
                /_______  / |____|    |____|_  /___\\____|__  /\\______  /           \\__/\\  / \\_______  /____|_  /____|__ \\/_______  / |____|  \\____|__  /\\______  /_______  /
                        \\/                   \\/            \\/        \\/                 \\/          \\/       \\/        \\/        \\/                  \\/        \\/        \\/\s
                             \s
                              SPRING-WORKSPACE :: 0.1
                            \s""");
    }
}
