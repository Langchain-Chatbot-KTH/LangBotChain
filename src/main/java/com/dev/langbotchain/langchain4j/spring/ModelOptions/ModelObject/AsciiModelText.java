package com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject;

import java.io.PrintWriter;
import java.util.Objects;

public class AsciiModelText {
    protected static void modelWrite(String modelName, PrintWriter writer) {
        if (Objects.equals(modelName, "llama2")) {

            writer.println("  ___________________ _______  _____________________    _____  .____                   _____   ________  ________  ___________.____       _________    ");
            writer.println(" /  _____/\\_   _____/ \\      \\ \\_   _____/\\______   \\  /  _  \\ |    |                 /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/    ");
            writer.println("/   \\  ___ |    __)_  /   |   \\ |    __)_  |       _/ /  /_\\  \\|    |       ______   /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\     ");
            writer.println("\\    \\_\\  \\|        \\/    |    \\|        \\ |    |   \\/    |    \\    |___   /_____/  /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\    ");
            writer.println(" \\______  /_______  /\\____|__  /_______  / |____|_  /\\____|__  /_______ \\           \\____|__  /\\_______  /_______  /_______  /|_______ \\/_______  /    ");
            writer.println("        \\/        \\/         \\/        \\/         \\/         \\/        \\/                   \\/         \\/        \\/        \\/         \\/        \\/     ");
            writer.println(" ______________________________________________________________________________________________________________________________________________________ ");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();

            writer.println(".__  .__                         ________  ");
            writer.println("|  | |  | _____    _____ _____   \\_____  \\");
            writer.println("|  | |  | \\__  \\  /     \\\\__  \\   /  ____/");
            writer.println("|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\");
            writer.println("|____/____(____  /__|_|  (____  /\\_______ \\");
            writer.println("               \\/      \\/     \\/         \\/");
            writer.println();
        }
        if (Objects.equals(modelName, "codellama")) {

            writer.println("_________  ________  ________  ___________              _____   ________  ________  ___________.____       _________");
            writer.println("\\_   ___ \\ \\_____  \\ \\______ \\ \\_   _____/             /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/");
            writer.println("/    \\  \\/  /   |   \\ |    |  \\ |    __)_    ______   /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\");
            writer.println("\\     \\____/    |    \\|    `   \\|        \\  /_____/  /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\");
            writer.println(" \\______  /\\_______  /_______  /_______  /           \\____|__  /\\_______  /_______  /_______  /|_______ \\/_______  /");
            writer.println("        \\/         \\/        \\/        \\/                    \\/         \\/        \\/        \\/         \\/        \\/");
            writer.println(" __________________________________________________________________________________________________________________");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();


            writer.println("                 .___     .__  .__                         ");
            writer.println("  ____  ____   __| _/____ |  | |  | _____    _____ _____   ");
            writer.println("_/ ___\\/  _ \\ / __ |/ __ \\|  | |  | \\__  \\  /     \\\\__  \\  ");
            writer.println("\\  \\__(  <_> ) /_/ \\  ___/|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_");
            writer.println(" \\___  >____/\\____ |\\___  >____/____(____  /__|_|  (____  /");
            writer.println("     \\/           \\/    \\/               \\/      \\/     \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "llama2-uncensored")) {
            writer.println(" ____ __________  _________ ___________ _______    _________________ _____________________________       _____   ________  ________  ___________.____       _________");
            writer.println("|    |   \\      \\ \\_   ___ \\\\_   _____/ \\      \\  /   _____/\\_____  \\\\______   \\_   _____/\\______ \\     /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/");
            writer.println("|    |   /   |   \\/    \\  \\/ |    __)_  /   |   \\ \\_____  \\  /   |   \\|       _/|    __)_  |    |  \\   /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\ ");
            writer.println("|    |  /    |    \\     \\____|        \\/    |    \\/        \\/    |    \\    |   \\|        \\ |    `   \\ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\");
            writer.println("|______/\\____|__  /\\______  /_______  /\\____|__  /_______  /\\_______  /____|_  /_______  //_______  / \\____|__  /\\_______  /_______  /|_______  /|_______ \\/_______  /");
            writer.println("                \\/        \\/        \\/         \\/        \\/         \\/       \\/        \\/         \\/          \\/         \\/        \\/        \\/         \\/        \\/ ");
            writer.println(" ____________________________________________________________________________________________________________________________________________________________________________________ ");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();

            writer.println(".__  .__                         ________                                                                           .___");
            writer.println("|  | |  | _____    _____ _____   \\_____  \\           __ __  ____   ____  ____   ____   _________________   ____   __| _/");
            writer.println("|  | |  | \\__  \\  /     \\__  \\   /  ____/   ______ |  |  \\/    \\_/ ___\\/ __ \\ /    \\ /  ___/  _ \\_  __ \\/ __ \\ / __ | ");
            writer.println("|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\  /_____/ |  |  /   |  \\  \\__\\  ___/|   |  \\___ (  <_> )  | \\/\\  ___// /_/ | ");
            writer.println("|____/____(____  /__|_|  (____  /\\_______ \\         |____/|___|  /\\___  >___  >___|  /____  >____/|__|    \\___  >____ | ");
            writer.println("               \\/      \\/     \\/         \\/                    \\/     \\/    \\/     \\/     \\/                  \\/     \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "mistral:7.3b")) {
            writer.println("        .__          __                .__   ");
            writer.println("  _____ |__| _______/  |_____________  |  |  ");
            writer.println(" /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |  ");
            writer.println("|  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__");
            writer.println("|__|_|  /__/____  > |__|  |__|  (____  /____/");
            writer.println("      \\/        \\/                   \\/       ");
            writer.println();
        }
        if (Objects.equals(modelName, "dolphin-mistral")) {
            writer.println("   .___     .__         .__    .__                         .__          __                .__   ");
            writer.println("  __| _/____ |  | ______ |  |__ |__| ____             _____ |__| _______/  |_____________  |  |  ");
            writer.println(" / __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\   ______  /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |  ");
            writer.println("/ /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\ /_____/ |  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__");
            writer.println("\\____ |\\____/|____/   __/|___|  /__|___|  /         |__|_|  /__/____  > |__|  |__|  (____  /____/");
            writer.println("     \\/           |__|        \\/        \\/                \\/        \\/                   \\/       ");
            writer.println();
        }
        if (Objects.equals(modelName, "mistral-openorca")) {
            writer.println("        .__          __                .__                                                                    ");
            writer.println("  _____ |__| _______/  |_____________  |  |             ____ ______   ____   ____   ___________   ____ _____   ");
            writer.println(" /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |    ______  /  _ \\\\____ \\_/ __ \\ /    \\ /  _ \\_  __ \\_/ ___\\\\__  \\  ");
            writer.println("|  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__ /_____/ (  <_> )  |_> >  ___/|   |  (  <_> )  | \\/\\  \\___ / __ \\_");
            writer.println("|__|_|  /__/____  > |__|  |__|  (____  /____/          \\____/|   __/ \\___  >___|  /\\____/|__|    \\___  >____  /");
            writer.println("      \\/        \\/                   \\/                      |__|        \\/     \\/                   \\/     \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "zephyr")) {
            writer.println("                     .__                   ");
            writer.println("________ ____ ______ |  |__ ___.__._______ ");
            writer.println("\\___   // __ \\____ \\|  |  <   |  |\\_  __ \\");
            writer.println(" /    /\\  ___/|  |_> >   Y  \\___  | |  | \\/");
            writer.println("/_____ \\___  >   __/|___|  / ____| |__|   ");
            writer.println("      \\/    \\/|__|        \\/\\/            ");
            writer.println();
        }
        if (Objects.equals(modelName, "mixtral")) {
            writer.println("        .__          __                .__   ");
            writer.println("  _____ |__|__  ____/  |_____________  |  |  ");
            writer.println(" /     \\|  \\  \\/  /\\   __\\_  __ \\__  \\ |  |  ");
            writer.println("|  Y Y  \\  |>    <  |  |  |  | \\// __ \\|  |__");
            writer.println("|__|_|  /__/__/\\_ \\ |__|  |__|  (____  /____/");
            writer.println("      \\/         \\/                  \\/       ");
            writer.println();
        }
        if (Objects.equals(modelName, "dolphin-mixtral")) {
            writer.println("    .___     .__         .__    .__                         .__          __                .__   ");
            writer.println("  __| _/____ |  | ______ |  |__ |__| ____             _____ |__|__  ____/  |_____________  |  |  ");
            writer.println(" / __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\   ______  /     \\|  \\  \\/  /\\   __\\_  __ \\__  \\ |  |  ");
            writer.println("/ /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\ /_____/ |  Y Y  \\  |>    <  |  |  |  | \\// __ \\|  |__");
            writer.println("\\____ |\\____/|____/   __/|___|  /__|___|  /         |__|_|  /__/__/\\_ \\ |__|  |__|  (____  /____/");
            writer.println("     \\/           |__|        \\/        \\/                \\/         \\/                  \\/       ");
            writer.println();
        }
        if (Objects.equals(modelName, "dolphin-phi")) {
            writer.println("    .___     .__         .__    .__                        .__    .__ ");
            writer.println("  __| _/____ |  | ______ |  |__ |__| ____           ______ |  |__ |__|");
            writer.println(" / __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\   ______ \\____ \\|  |  \\|  |");
            writer.println("/ /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\ /_____/ |  |_> >   Y  \\  |");
            writer.println("\\____ |\\____/|____/   __/|___|  /__|___|  /         |   __/|___|  /__|");
            writer.println("     \\/           |__|        \\/        \\/          |__|        \\/     ");
            writer.println();
        }
        if (Objects.equals(modelName, "phi")) {
            writer.println("       .__    .__ ");
            writer.println("______ |  |__ |__|");
            writer.println("\\____ \\|  |  \\|  |");
            writer.println("|  |_> >   Y  \\  |");
            writer.println("|   __/|___|  /__|");
            writer.println("|__|        \\/     ");
            writer.println();
        }
        if (Objects.equals(modelName, "neural-chat")) {
            writer.println("                                  .__                   .__            __   ");
            writer.println("  ____   ____  __ ______________  |  |             ____ |  |__ _____ _/  |_ ");
            writer.println(" /    \\_/ __ \\|  |  \\_  __ \\__  \\ |  |    ______ _/ ___\\|  |  \\\\__  \\\\   __\\");
            writer.println("|   |  \\  ___/|  |  /|  | \\// __ \\|  |__ /_____/ \\  \\___|   Y  \\/ __ \\|  |  ");
            writer.println("|___|  /\\___  >____/ |__|  (____  /____/          \\___  >___|  (____  /__|  ");
            writer.println("     \\/     \\/                  \\/                    \\/     \\/     \\/      ");
            writer.println();
        }
        if (Objects.equals(modelName, "starling-lm")) {
            writer.println("          __               .__  .__                         .__           ");
            writer.println("  _______/  |______ _______|  | |__| ____    ____           |  |   _____  ");
            writer.println(" /  ___/\\   __\\__  \\\\_  __ \\  | |  |/    \\  / ___\\   ______ |  |  /     \\ ");
            writer.println(" \\___ \\  |  |  / __ \\|  | \\/  |_|  |   |  \\/ /_/  > /_____/ |  |_|  Y Y  \\");
            writer.println("/____  > |__| (____  /__|  |____/__|___|  /\\___  /          |____/__|_|  /");
            writer.println("     \\/            \\/                   \\//_____/                      \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "orca-mini")) {
            writer.println("                                              .__       .__ ");
            writer.println("  ___________   ____ _____              _____ |__| ____ |__|");
            writer.println(" /  _ \\_  __ \\_/ ___\\__  \\    ______  /     \\|  |/    \\|  |");
            writer.println("(  <_> )  | \\/\\  \\___ / __ \\_ /_____/ |  Y Y  \\  |   |  \\  |");
            writer.println(" \\____/|__|    \\___  >____  /         |__|_|  /__|___|  /__|");
            writer.println("                   \\/     \\/                \\/        \\/     ");
            writer.println();
        }
        if (Objects.equals(modelName, "deepseek-coder")) {
            writer.println("    .___                                        __                              .___            ");
            writer.println("  __| _/____   ____ ______  ______ ____   ____ |  | __           ____  ____   __| _/___________ ");
            writer.println(" / __ |/ __ \\_/ __ \\____ \\/  ___// __ \\_/ __ \\|  |/ /  ______ _/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
            writer.println("/ /_/ \\  ___/\\  ___/|  |_> >___ \\  ___/\\  ___/|    <  /_____/ \\  \\__(  <_> ) /_/ \\  ___/|  | \\/");
            writer.println("\\____ |\\___  >\\___  >   __/____  >\\___  >\\___  >__|_ \\          \\___  >____/\\____ |\\___  >__|   ");
            writer.println("     \\/    \\/     \\/|__|       \\/     \\/     \\/     \\/              \\/           \\/    \\/        ");
            writer.println();
        }
        if (Objects.equals(modelName, "vicuna")) {
            writer.println("      .__                            ");
            writer.println("___  _|__| ____  __ __  ____ _____   ");
            writer.println("\\  \\/ /  |/ ___\\|  |  \\/    \\\\__  \\  ");
            writer.println(" \\   /|  \\  \\___|  |  /   |  \\/ __ \\_");
            writer.println("  \\_/ |__|\\___  >____/|___|  (____  /");
            writer.println("              \\/           \\/     \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "wizard-vicuna-uncensored")) {
            writer.println("        .__                         .___              .__                                                                                                     .___");
            writer.println("__  _  _|__|____________ _______  __| _/        ___  _|__| ____  __ __  ____ _____             __ __  ____   ____  ____   ____   _________________   ____   __| _/");
            writer.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ |  ______ \\  \\/ /  |/ ___\\|  |  \\/    \\__  \\    ______ |  |  \\/    \\_/ ___\\/ __ \\ /    \\ /  ___/  _ \\_  __ \\_/ __ \\ / __ | ");
            writer.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | /_____/  \\   /|  \\  \\___|  |  /   |  \\/ __ \\_ /_____/ |  |  /   |  \\  \\__\\  ___/|   |  \\___ (  <_> )  | \\/\\  ___// /_/ | ");
            writer.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ |           \\_/ |__|\\___  >____/|___|  (____  /         |____/|___|  /\\___  >___  >___|  /____  >____/|__|    \\___  >____ | ");
            writer.println("                 \\/     \\/           \\/                       \\/           \\/     \\/                     \\/     \\/    \\/     \\/     \\/                  \\/     \\/  ");
            writer.println();
        }
        if(Objects.equals(modelName, "tinydolphin")){
            writer.println("  __  .__                 .___     .__         .__    .__        ");
            writer.println("_/  |_|__| ____ ___.__. __| _/____ |  | ______ |  |__ |__| ____  ");
            writer.println("\\   __\\  |/    <   |  |/ __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\ ");
            writer.println(" |  | |  |   |  \\___  / /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\");
            writer.println(" |__| |__|___|  / ____\\____ |\\____/|____/   __/|___|  /__|___|  /");
            writer.println("              \\/\\/         \\/           |__|        \\/        \\/ ");
            System.out.println();
        }
        if(Objects.equals(modelName, "wizardlm-uncensored")){
            writer.println("        .__                         .___.__                                                                                    .___");
            writer.println("__  _  _|__|____________ _______  __| _/|  |   _____            __ __  ____   ____  ____   ____   _________________   ____   __| _/");
            writer.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ | |  |  /     \\   ______ |  |  \\/    \\_/ ___\\/ __ \\ /    \\ /  ___/  _ \\_  __ \\/ __ \\ / __ | ");
            writer.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | |  |_|  Y Y  \\ /_____/ |  |  /   |  \\  \\__\\  ___/|   |  \\___ (  <_> )  | \\/\\  ___// /_/ | ");
            writer.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ | |____/__|_|  /         |____/|___|  /\\___  >___  >___|  /____  >____/|__|    \\___  >____ | ");
            writer.println("                 \\/     \\/           \\/            \\/                     \\/     \\/    \\/     \\/     \\/                  \\/     \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "llava:7b")) {
            writer.println(".__  .__                       ");
            writer.println("|  | |  | _____ ___  _______   ");
            writer.println("|  | |  | \\__  \\\\  \\/ /\\__  \\  ");
            writer.println("|  |_|  |__/ __ \\\\   /  / __ \\_");
            writer.println("|____/____(____  /\\_/  (____  /");
            writer.println("               \\/           \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "gemma:2b")) {
            writer.println("                                       ");
            writer.println("   ____   ____   _____   _____ _____   ");
            writer.println("  / ___\\_/ __ \\ /     \\ /     \\__  \\  ");
            writer.println(" / /_/  >  ___/|  Y Y  \\  Y Y  \\/ __ \\_");
            writer.println(" \\___  / \\___  >__|_|  /__|_|  (____  /");
            writer.println("/_____/      \\/      \\/      \\/     \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "openhermes")) {
            writer.println("                            .__                                        ");
            writer.println("  ____ ______   ____   ____ |  |__   ___________  _____   ____   ______");
            writer.println(" /  _ \\____ \\_/ __ \\ /    \\|  |  \\_/ __ \\_  __ \\/     \\_/ __ \\ /  ___/");
            writer.println("(  <_> )  |_> >  ___/|   |  \\   Y  \\  ___/|  | \\/  Y Y  \\  ___/ \\___ \\ ");
            writer.println(" \\____/|   __/ \\___  >___|  /___|  /\\___  >__|  |__|_|  /\\___  >____  >");
            writer.println("       |__|        \\/     \\/     \\/     \\/            \\/     \\/     \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "tinyllama")) {
            writer.println("  __  .__              .__  .__                         ");
            writer.println("_/  |_|__| ____ ___.__.|  | |  | _____    _____ _____   ");
            writer.println("\\   __\\  |/    <   |  ||  | |  | \\__  \\  /     \\\\__  \\  ");
            writer.println(" |  | |  |   |  \\___  ||  |_|  |__/ __ \\|  Y Y  \\/ __ \\_");
            writer.println(" |__| |__|___|  / ____||____/____(____  /__|_|  (____  /");
            writer.println("              \\/\\/                    \\/      \\/     \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "openchat")){
            writer.println("                                   .__            __   ");
            writer.println("  ____ ______   ____   ____   ____ |  |__ _____ _/  |_ ");
            writer.println(" /  _ \\____ \\_/ __ \\ /    \\_/ ___\\|  |  \\\\__  \\\\   __\\");
            writer.println("(  <_> )  |_> >  ___/|   |  \\  \\___|   Y  \\/ __ \\|  |  ");
            writer.println(" \\____/|   __/ \\___  >___|  /\\___  >___|  (____  /__|  ");
            writer.println("       |__|        \\/     \\/     \\/     \\/     \\/      ");
            writer.println();
        }
        if(Objects.equals(modelName, "orca2")){
            writer.println("                             ________  ");
            writer.println("  ___________   ____ _____   \\_____  \\ ");
            writer.println(" /  _ \\_  __ \\_/ ___\\\\__  \\   /  ____/ ");
            writer.println("(  <_> )  | \\/\\  \\___ / __ \\_/       \\ ");
            writer.println(" \\____/|__|    \\___  >____  /\\_______ \\");
            writer.println("                   \\/     \\/         \\/");
            writer.println();
        }
        if(Objects.equals(modelName, "falcon")){
            writer.println("  _____       .__                       ");
            writer.println("_/ ____\\____  |  |   ____  ____   ____  ");
            writer.println("\\   __\\\\__  \\ |  | _/ ___\\/  _ \\ /    \\ ");
            writer.println(" |  |   / __ \\|  |_\\  \\__(  <_> )   |  \\");
            writer.println(" |__|  (____  /____/\\___  >____/|___|  /");
            writer.println("            \\/          \\/           \\/ ");
        }
        if(Objects.equals(modelName, "everythinglm")){
            writer.println("                                   __  .__    .__               .__           ");
            writer.println("  _______  __ ___________ ___.__._/  |_|  |__ |__| ____    ____ |  |   _____  ");
            writer.println("_/ __ \\  \\/ // __ \\_  __ <   |  |\\   __\\  |  \\|  |/    \\  / ___\\|  |  /     \\ ");
            writer.println("\\  ___/\\   /\\  ___/|  | \\/\\___  | |  | |   Y  \\  |   |  \\/ /_/  >  |_|  Y Y  \\");
            writer.println(" \\___  >\\_/  \\___  >__|   / ____| |__| |___|  /__|___|  /\\___  /|____/__|_|  /");
            writer.println("     \\/          \\/       \\/                \\/        \\//_____/            \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "bakllava")){
            writer.println("___.           __   .__  .__                       ");
            writer.println("\\_ |__ _____  |  | _|  | |  | _____ ___  _______   ");
            writer.println(" | __ \\__  \\ |  |/ /  | |  | \\__  \\\\  \\/ /\\__  \\  ");
            writer.println(" | \\_\\ \\/ __ \\|    <|  |_|  |__/ __ \\\\   /  / __ \\_");
            writer.println(" |___  (____  /__|_ \\____/____(____  /\\_/  (____  /");
            writer.println("     \\/     \\/     \\/              \\/           \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "solar")){
            writer.println("             .__                ");
            writer.println("  __________ |  | _____ _______ ");
            writer.println(" /  ___/  _ \\|  | \\__  \\\\_  __ \\");
            writer.println(" \\___ \\(  <_> )  |__/ __ \\|  | \\/");
            writer.println("/____  >____/|____(____  /__|   ");
            writer.println("     \\/                \\/       ");
        }
        if(Objects.equals(modelName, "stable-beluga")){
            writer.println("          __        ___.   .__                  ___.          .__                      ");
            writer.println("  _______/  |______ \\_ |__ |  |   ____          \\_ |__   ____ |  |  __ __  _________   ");
            writer.println(" /  ___/\\   __\\__  \\ | __ \\|  | _/ __ \\   ______ | __ \\_/ __ \\|  | |  |  \\/ ___\\__  \\  ");
            writer.println(" \\___ \\  |  |  / __ \\| \\_\\ \\  |_\\  ___/  /_____/ | \\_\\ \\  ___/|  |_|  |  / /_/  > __ \\_");
            writer.println("/____  > |__| (____  /___  /____/\\___  >         |___  /\\___  >____/____/\\___  (____  /");
            writer.println("     \\/            \\/    \\/          \\/              \\/     \\/          /_____/     \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "yarn-mistral")){
            writer.println("                                              .__          __                .__   ");
            writer.println(" ___.__._____ _______  ____             _____ |__| _______/  |_____________  |  |  ");
            writer.println("<   |  |\\__  \\\\_  __ \\/    \\   ______  /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |  ");
            writer.println(" \\___  | / __ \\|  | \\/   |  \\ /_____/ |  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__");
            writer.println(" / ____|/ (____  /__|  |___|  /         |__|_|  /__/____  > |__|  |__|  (____  /____/");
            writer.println(" \\/          \\/           \\/                \\/        \\/                   \\/       ");
            writer.println();
        }
        if(Objects.equals(modelName, "samantha-mistral")){
            writer.println("                                      __  .__                             .__          __                .__   ");
            writer.println("  ___________    _____ _____    _____/  |_|  |__ _____              _____ |__| _______/  |_____________  |  |  ");
            writer.println(" /  ___/\\__  \\  /     \\\\__  \\  /    \\   __\\  |  \\\\__  \\    ______  /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |  ");
            writer.println(" \\___ \\  / __ \\|  Y Y  \\/ __ \\|   |  \\  | |   Y  \\/ __ \\_ /_____/ |  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__");
            writer.println("/____  >(____  /__|_|  (____  /___|  /__| |___|  (____  /         |__|_|  /__/____  > |__|  |__|  (____  /____/");
            writer.println("     \\/      \\/      \\/     \\/     \\/          \\/     \\/                \\/        \\/                   \\/       ");
            writer.println();
        }
        if(Objects.equals(modelName, "stablelm-zephyr")){
            writer.println("          __        ___.   .__         .__                                         .__                   ");
            writer.println("  _______/  |______ \\_ |__ |  |   ____ |  |   _____           ________ ____ ______ |  |__ ___.__._______ ");
            writer.println(" /  ___/\\   __\\__  \\ | __ \\|  | _/ __ \\|  |  /     \\   ______ \\___   // __ \\____ \\|  |  <   |  |\\_  __ \\");
            writer.println(" \\___ \\  |  |  / __ \\| \\_\\ \\  |_\\  ___/|  |_|  Y Y  \\ /_____/  /    /\\  ___/|  |_> >   Y  \\___  | |  | \\/");
            writer.println("/____  > |__| (____  /___  /____/\\___  >____/__|_|  /         /_____ \\\\___  >   __/|___|  / ____| |__|   ");
            writer.println("     \\/            \\/    \\/          \\/           \\/                \\/    \\/|__|        \\/\\/              ");
            writer.println();
        }
        if(Objects.equals(modelName, "wizard-vicuna")){
            writer.println("        .__                         .___              .__                            ");
            writer.println("__  _  _|__|____________ _______  __| _/        ___  _|__| ____  __ __  ____ _____   ");
            writer.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ |  ______ \\  \\/ /  |/ ___\\|  |  \\/    \\\\__  \\  ");
            writer.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | /_____/  \\   /|  \\  \\___|  |  /   |  \\/ __ \\_");
            writer.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ |           \\_/ |__|\\___  >____/|___|  (____  /");
            writer.println("                 \\/     \\/           \\/                       \\/           \\/     \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "yarn-llama2")){
            writer.println("                                      .__  .__                         ________  ");
            writer.println(" ___.__._____ _______  ____           |  | |  | _____    _____ _____   \\_____  \\ ");
            writer.println("<   |  |\\__  \\\\_  __ \\/    \\   ______ |  | |  | \\__  \\  /     \\\\__  \\   /  ____/ ");
            writer.println(" \\___  | / __ \\|  | \\/   |  \\ /_____/ |  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\");
            writer.println(" / ____|(____  /__|  |___|  /         |____/____(____  /__|_|  (____  /\\_______ \\");
            writer.println(" \\/          \\/           \\/                         \\/      \\/     \\/         \\/");
            writer.println();
        }
        if(Objects.equals(modelName, "notux")){
            writer.println("               __                ");
            writer.println("  ____   _____/  |_ __ _____  ___");
            writer.println(" /    \\ /  _ \\   __\\  |  \\  \\/  /");
            writer.println("|   |  (  <_> )  | |  |  />    < ");
            writer.println("|___|  /\\____/|__| |____//__/\\_ \\");
            writer.println("     \\/                        \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "alfred")){
            writer.println("       .__   _____                   .___");
            writer.println("_____  |  |_/ ____\\______   ____   __| _/");
            writer.println("\\__  \\ |  |\\   __\\\\_  __ \\_/ __ \\ / __ | ");
            writer.println(" / __ \\|  |_|  |   |  | \\/\\  ___// /_/ | ");
            writer.println("(____  /____/__|   |__|    \\___  >____ | ");
            writer.println("     \\/                        \\/     \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "megadolphin")){
            writer.println("                                 .___     .__         .__    .__        ");
            writer.println("  _____   ____   _________     __| _/____ |  | ______ |  |__ |__| ____  ");
            writer.println(" /     \\_/ __ \\ / ___\\__  \\   / __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\ ");
            writer.println("|  Y Y  \\  ___// /_/  > __ \\_/ /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\");
            writer.println("|__|_|  /\\___  >___  (____  /\\____ |\\____/|____/   __/|___|  /__|___|  /");
            writer.println("      \\/     \\/_____/     \\/      \\/           |__|        \\/        \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "wizardlm:7b-q4_0")){
            writer.println("        .__                         .___.__           ");
            writer.println("__  _  _|__|____________ _______  __| _/|  |   _____  ");
            writer.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ | |  |  /     \\ ");
            writer.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | |  |_|  Y Y  \\");
            writer.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ | |____/__|_|  /");
            writer.println("                 \\/     \\/           \\/            \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "mistrallite")){
            writer.println("        .__          __                .__  .__  .__  __          ");
            writer.println("  _____ |__| _______/  |_____________  |  | |  | |__|/  |_  ____  ");
            writer.println(" /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  | |  | |  \\   __\\/ __ \\ ");
            writer.println("|  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |_|  |_|  ||  | \\  ___/ ");
            writer.println("|__|_|  /__/____  > |__|  |__|  (____  /____/____/__||__|  \\___  >");
            writer.println("      \\/        \\/                   \\/                        \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "wizardcoder")) {
            writer.println("        .__                         .___               .___            ");
            writer.println("__  _  _|__|____________ _______  __| _/____  ____   __| _/___________ ");
            writer.println("\\ \\/ \\/ /  \\___   /\\__  \\\\  __ \\/ __ |/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
            writer.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ \\  \\__(  <_> ) /_/ \\  ___/|  | \\/");
            writer.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ |\\___  >____/\\____ |\\___  >__|   ");
            writer.println("                 \\/     \\/           \\/    \\/           \\/    \\/       ");
            writer.println();
        }
        if(Objects.equals(modelName, "phind-codellama")){
            writer.println("       .__    .__            .___                         .___     .__  .__                         ");
            writer.println("______ |  |__ |__| ____    __| _/          ____  ____   __| _/____ |  | |  | _____    _____ _____   ");
            writer.println("\\____ \\|  |  \\|  |/    \\  / __ |  ______ _/ ___\\/  _ \\ / __ |/ __ \\|  | |  | \\__  \\  /     \\\\__  \\ ");
            writer.println("|  |_> >   Y  \\  |   |  \\/ /_/ | /_____/ \\  \\__(  <_> ) /_/ \\  ___/|  |_|  |__/ __ \\|  Y Y  \\/ __ \\");
            writer.println("|   __/|___|  /__|___|  /\\____ |          \\___  >____/\\____ |\\___  >____/____(____  /__|_|  (____  /");
            writer.println("|__|        \\/        \\/      \\/              \\/           \\/    \\/               \\/      \\/     \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "codeup")){
            writer.println("                 .___                   ");
            writer.println("  ____  ____   __| _/____  __ ________  ");
            writer.println("_/ ___\\/  _ \\ / __ |/ __ \\|  |  \\____ \\ ");
            writer.println("\\  \\__(  <_> ) /_/ \\  ___/|  |  /  |_> >");
            writer.println(" \\___  >____/\\____ |\\___  >____/|   __/ ");
            writer.println("     \\/           \\/    \\/      |__|    ");
            writer.println();
        }
        if(Objects.equals(modelName, "starcoder")){
            writer.println("          __                                 .___            ");
            writer.println("  _______/  |______ _______   ____  ____   __| _/___________ ");
            writer.println(" /  ___/\\   __\\__  \\\\_  __ \\_/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
            writer.println(" \\___ \\  |  |  / __ \\|  | \\/\\  \\__(  <_> ) /_/ \\  ___/|  | \\/");
            writer.println("/____  > |__| (____  /__|    \\___  >____/\\____ |\\___  >__|   ");
            writer.println("     \\/            \\/            \\/           \\/    \\/       ");
            writer.println();
        }
        if(Objects.equals(modelName, "stable-code")){
            writer.println("          __        ___.   .__                                    .___      ");
            writer.println("  _______/  |______ \\_ |__ |  |   ____             ____  ____   __| _/____  ");
            writer.println(" /  ___/\\   __\\__  \\ | __ \\|  | _/ __ \\   ______ _/ ___\\/  _ \\ / __ |/ __ \\ ");
            writer.println(" \\___ \\  |  |  / __ \\| \\_\\ \\  |_\\  ___/  /_____/ \\  \\__(  <_> ) /_/ \\  ___/ ");
            writer.println("/____  > |__| (____  /___  /____/\\___  >          \\___  >____/\\____ |\\___  >");
            writer.println("     \\/            \\/    \\/          \\/               \\/           \\/    \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "magicoder")){
            writer.println("                       .__                 .___            ");
            writer.println("  _____ _____     ____ |__| ____  ____   __| _/___________ ");
            writer.println(" /     \\__  \\   / ___\\|  |/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
            writer.println("|  Y Y  \\/ __ \\_/ /_/  >  \\  \\__(  <_> ) /_/ \\  ___/|  | \\/");
            writer.println("|__|_|  (____  /\\___  /|__|\\___  >____/\\____ |\\___  >__|   ");
            writer.println("      \\/     \\/     \\/         \\/           \\/    \\/       ");
            writer.println();
        }
        if(Objects.equals(modelName, "codebooga")){
            writer.println("                 .___    ___.                               ");
            writer.println("  ____  ____   __| _/____\\_ |__   ____   ____   _________   ");
            writer.println("_/ ___\\/  _ \\ / __ |/ __ \\| __ \\ /  _ \\ /  _ \\ / ___\\__  \\  ");
            writer.println("\\  \\__(  <_> ) /_/ \\  ___/| \\_\\ (  <_> |  <_> ) /_/  > __ \\_");
            writer.println(" \\___  >____/\\____ |\\___  >___  /\\____/ \\____/\\___  (____  /");
            writer.println("     \\/           \\/    \\/    \\/             /_____/     \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "nexusraven")){
            writer.println("                                                                     ");
            writer.println("  ____   ____ ___  _____ __  __________________ ___  __ ____   ____  ");
            writer.println(" /    \\_/ __ \\\\  \\/  /  |  \\/  ___/\\_  __ \\__  \\\\  \\/ // __ \\ /    \\ ");
            writer.println("|   |  \\  ___/ >    <|  |  /\\___ \\  |  | \\// __ \\\\   /\\  ___/|   |  \\");
            writer.println("|___|  /\\___  >__/\\_ \\____//____  > |__|  (____  /\\_/  \\___  >___|  /");
            writer.println("     \\/     \\/      \\/          \\/             \\/          \\/     \\/ ");
            writer.println();
        }
        if (Objects.equals(modelName, "llama2-chinese")) {
            writer.println(" _______   ________    _______            ___________ _______    ________.____    .___  _________ ___ ___  ");
            writer.println(" \\      \\  \\_____  \\   \\      \\           \\_   _____/ \\      \\  /  _____/|    |   |   |/   _____//   |   \\ ");
            writer.println(" /   |   \\  /   |   \\  /   |   \\   ______  |    __)_  /   |   \\/   \\  ___|    |   |   |\\_____  \\/    ~    \\");
            writer.println("/    |    \\/    |    \\/    |    \\ /_____/  |        \\/    |    \\    \\_\\  \\    |___|   |/        \\    Y    /");
            writer.println("\\____|__  /\\_______  /\\____|__  /         /_______  /\\____|__  /\\______  /_______ \\___/_______  /\\___|_  / ");
            writer.println("        \\/         \\/         \\/                  \\/         \\/        \\/        \\/           \\/       \\/  ");
            writer.println(" ____________________________________________________________________________________________________________");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();

            writer.println(".__  .__                         ________                  .__    .__                             ");
            writer.println("|  | |  | _____    _____ _____   \\_____  \\            ____ |  |__ |__| ____   ____   ______ ____  ");
            writer.println("|  | |  | \\__  \\  /     \\__  \\   /  ____/   ______ _/ ___\\|  |  \\|  |/    \\_/ __ \\ /  ___// __ \\ ");
            writer.println("|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\  /_____/ \\  \\___|   Y  \\  |   |  \\  ___/ \\___ \\\\  ___/ ");
            writer.println("|____/____(____  /__|_|  (____  /\\_______ \\          \\___  >___|  /__|___|  /\\___  >____  >\\___  >");
            writer.println("               \\/      \\/     \\/         \\/              \\/     \\/        \\/     \\/     \\/     \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "qwen:0.5b")){
            writer.println("  ________  _  __ ____   ____  ");
            writer.println(" / ____/\\ \\/ \\/ // __ \\ /    \\ ");
            writer.println("< <_|  | \\     /\\  ___/|   |  \\");
            writer.println(" \\__   |  \\/\\_/  \\___  >___|  /");
            writer.println("    |__|             \\/     \\/ ");
            writer.println();
        }
        if(Objects.equals(modelName, "yi")){
            writer.println("        .__ ");
            writer.println("  ___.__.|__|");
            writer.println(" <   |  ||  |");
            writer.println("  \\___  ||  |");
            writer.println("  / ____||__|");
            writer.println("  \\/        ");
            writer.println();
        }
        if(Objects.equals(modelName, "nous-hermes")){
            writer.println("                                     .__                                        ");
            writer.println("  ____   ____  __ __  ______         |  |__   ___________  _____   ____   ______");
            writer.println(" /    \\ /  _ \\|  |  \\/  ___/  ______ |  |  \\_/ __ \\_  __ \\/     \\_/ __ \\ /  ___/");
            writer.println("|   |  (  <_> )  |  /\\___ \\  /_____/ |   Y  \\  ___/|  | \\/  Y Y  \\  ___/ \\___ \\ ");
            writer.println("|___|  /\\____/|____/____  >         |___|  /\\___  >__|  |__|_|  /\\___  >____  >");
            writer.println("     \\/                  \\/               \\/     \\/            \\/     \\/     \\/");
            writer.println();
        }
        if(Objects.equals(modelName, "stablelm2")){
            writer.println("          __        ___.   .__         .__           ________  ");
            writer.println("  _______/  |______ \\_ |__ |  |   ____ |  |   _____  \\_____  \\ ");
            writer.println(" /  ___/\\   __\\__  \\ | __ \\|  | _/ __ \\|  |  /     \\  /  ____/ ");
            writer.println(" \\___ \\  |  |  / __ \\| \\_\\ \\  |_\\  ___/|  |_|  Y Y  \\/       \\ ");
            writer.println("/____  > |__| (____  /___  /____/\\___  >____/__|_|  /\\_______ \\");
            writer.println("     \\/            \\/    \\/          \\/           \\/         \\/");
            writer.println();
        }
        if (Objects.equals(modelName, "deepseek-llm")) {
            writer.println("   _____      ___________________ ___           _________  ________  ________  ___________            _____   ________  ________  ___________.____       _________ ");
            writer.println("  /     \\    /  _  \\__    ___/   |   \\          \\_   ___ \\ \\_____  \\ \\______ \\ \\_   _____/           /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/ ");
            writer.println(" /  \\ /  \\  /  /_\\  \\|    | /    ~    \\  ______ /    \\  \\/  /   |   \\ |    |  \\ |    __)_   ______  /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\  ");
            writer.println("/    Y    \\/    |    \\    | \\    Y    / /_____/ \\     \\____/    |    \\|    `   \\|        \\ /_____/ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\ ");
            writer.println("\\____|__  /\\____|__  /____|  \\___|_  /           \\______  /\\_______  /_______  /_______  /         \\____|__  /\\_______  /_______  /|_______ \\/_______  / ");
            writer.println("        \\/         \\/              \\/                   \\/         \\/        \\/        \\/                  \\/         \\/        \\/        \\/         \\/        \\/  ");
            writer.println(" _________________________________________________________________________________________________________________________________________________________________");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();

            writer.println("   .___                                        __             .__  .__           ");
            writer.println("  __| _/____   ____ ______  ______ ____   ____ |  | __         |  | |  |   _____  ");
            writer.println(" / __ |/ __ \\_/ __ \\____ \\/  ___// __ \\_/ __ \\|  |/ /  ______ |  | |  |  /     \\ ");
            writer.println("/ /_/ \\  ___/\\  ___/|  |_> >___ \\\\  ___/\\  ___/|    <  /_____/ |  |_|  |_|  Y Y  \\");
            writer.println("\\____ |\\___  >\\___  >   __/____  >\\___  >\\___  >__|_ \\         |____/____/__|_|  /");
            writer.println("     \\/    \\/     \\/|__|       \\/     \\/     \\/     \\/                         \\/ ");
        }
        if(Objects.equals(modelName, "llama-pro")){
            writer.println(".__  .__                                                       ");
            writer.println("|  | |  | _____    _____ _____            _____________  ____  ");
            writer.println("|  | |  | \\__  \\  /     \\__  \\    ______ \\____ \\_  __ \\/  _ \\ ");
            writer.println("|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_ /_____/ |  |_> >  | \\(  <_> )");
            writer.println("|____/____(____  /__|_|  (____  /         |   __/|__|   \\____/ ");
            writer.println("               \\/      \\/     \\/          |__|                 ");
            writer.println();
        }
        if (Objects.equals(modelName, "sqlcoder")) {
            writer.println("  _________________  .____                 _____   ________  ________  ___________.____       _________");
            writer.println(" /   _____/\\_____  \\ |    |               /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/");
            writer.println(" \\_____  \\  /  / \\  \\|    |      ______  /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\ ");
            writer.println(" /        \\/   \\_/.  \\    |___  /_____/ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\");
            writer.println("/_______  /\\______\\ \\_/_______ \\         \\____|__  /\\_______  /_______  /|_______ \\/_______  /");
            writer.println("        \\/        \\__>       \\/                 \\/         \\/        \\/         \\/        \\/");
            writer.println(" ________________________________________________________________________________________________ ");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();

            writer.println("            .__                   .___            ");
            writer.println("  ___________|  |   ____  ____   __| _/___________ ");
            writer.println(" /  ___/ ____/  | _/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
            writer.println(" \\___ < <_|  |  |_ \\__(  <_> ) /_/ \\  ___/|  | \\/");
            writer.println("/____  >__   |____/\\___  >____/\\____ |\\___  >__|   ");
            writer.println("     \\/   |__|         \\/           \\/    \\/       ");
        }
        if(Objects.equals(modelName, "duckdb-nsql")){
            writer.println(".___             __       ._______.                                 .__   ");
            writer.println("__| _/\\ __   ____ |  | __ __| _/\\__ |__             ____   ___________|  |  ");
            writer.println("/ __ |  |  \\_/ ___\\|  |/ // __ |  | __ \\   ______  /    \\ /  ___/ ____/  |  ");
            writer.println("/ /_/ |  |  /\\  \\___|    </ /_/ |  | \\_\\ \\ /_____/ |   |  \\\\___ < <_|  |  |__");
            writer.println("\\____ |____/  \\___  >__|_ \\____ |  |___  /         |___|  /____  >__   |____/");
            writer.println("     \\/           \\/     \\/    \\/      \\/               \\/     \\/   |__|     ");
            writer.println();
        }
        if (Objects.equals(modelName, "wizard-math")) {
            writer.println(" _____      ___________________ ___              _____   ________  ________  ___________.____       _________");
            writer.println("  /     \\    /  _  \\__    ___/   |   \\            /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/");
            writer.println(" /  \\ /  \\  /  /_\\  \\|    | /    ~    \\  ______  /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\ ");
            writer.println("/    Y    \\/    |    \\    | \\    Y    / /_____/ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\");
            writer.println("\\____|__  /\\____|__  /____|  \\___|_  /          \\____|__  /\\_______  /_______  /|_______ \\/_______  /");
            writer.println("        \\/         \\/              \\/                   \\/         \\/        \\/        \\/        \\/ ");
            writer.println(" ________________________________________________________________________________________________ ");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();

            writer.println("        .__                         .___                        __  .__     ");
            writer.println("__  _  _|__|____________ _______  __| _/          _____ _____ _/  |_|  |__  ");
            writer.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ |  ______  /     \\__  \\\\   __\\  |  \\ ");
            writer.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | /_____/ |  Y Y  \\/ __ \\|  | |   Y  \\");
            writer.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ |         |__|_|  (____  /__| |___|  /");
            writer.println("                 \\/     \\/           \\/               \\/     \\/          \\/ ");
        }
        if (Objects.equals(modelName, "nous-hermes2")) {
            writer.println("  __________________ .______________ __________________.______________.____________           ________  .___  __________________  ____ ___  _________ _________.___________    _______     ");
            writer.println(" /   _____/\\_   ___ \\|   \\_   _____/ \\      \\__    ___/|   \\_   _____/|   \\_   ___ \\          \\______ \\ |   |/   _____/\\_   ___ \\|    |   \\/   _____//   _____/|   \\_____  \\   \\      \\    ");
            writer.println(" \\_____  \\ /    \\  \\/|   ||    __)_  /   |   \\|    |   |   ||    __)  |   /    \\  \\/   ______  |    |  \\|   |\\_____  \\ /    \\  \\/|    |   /\\_____  \\ \\_____  \\ |   |/   |   \\  /   |   \\   ");
            writer.println(" /        \\\\     \\___|   ||        \\/    |    \\    |   |   ||     \\   |   \\     \\____ /_____/  |    `   \\   |/        \\\\     \\___|    |  / /        \\/        \\|   /    |    \\/    |    \\  ");
            writer.println("/_______  / \\______  /___/_______  /\\____|__  /____|   |___|\\___  /   |___|\\______  /         /_______  /___/_______  / \\______  /______/ /_______  /_______  /|___\\_______  /\\____|__  / ");
            writer.println("        \\/         \\/            \\/         \\/                  \\/                \\/                  \\/            \\/         \\/                 \\/        \\/             \\/         \\/  ");
            writer.println(" ____________________________________________________________________________________________________________________________________________________________________________________ ");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();

            writer.println("                                     .__                                       ________  ");
            writer.println("  ____   ____  __ __  ______         |  |__   ___________  _____   ____   _____\\_____  \\ ");
            writer.println(" /    \\ /  _ \\|  |  \\/  ___/  ______ |  |  \\_/ __ \\_  __ \\/     \\_/ __ \\ /  ___//  ____/ ");
            writer.println("|   |  (  <_> )  |  /\\___ \\  /_____/ |   Y  \\  ___/|  | \\/  Y Y  \\  ___/ \\___ \\/       \\ ");
            writer.println("|___|  /\\____/|____/____  >         |___|  /\\___  >__|  |__|_|  /\\___  >____  >_______ \\");
            writer.println("     \\/                  \\/               \\/     \\/            \\/     \\/     \\/        \\/ ");
        }
        if (Objects.equals(modelName, "medllama2:7b")) {
            writer.println("   _____  ___________________  .____________     _____  .____                 _____   ________  ________  ___________.____       _________ ");
            writer.println("  /     \\ \\_   _____/\\______ \\ |   \\_   ___ \\   /  _  \\ |    |               /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/ ");
            writer.println(" /  \\ /  \\ |    __)_  |    |  \\|   /    \\  \\/  /  /_\\  \\|    |      ______  /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\  ");
            writer.println("/    Y    \\|        \\ |    `   \\   \\     \\____/    |    \\    |___  /_____/ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\ ");
            writer.println("\\____|__  /_______  //_______  /___|\\______  /\\____|__  /_______ \\         \\____|__  /\\_______  /_______  /_______  /|_______ \\/_______  / ");
            writer.println("        \\/        \\/         \\/            \\/         \\/        \\/                 \\/         \\/        \\/        \\/         \\/        \\/  ");
            writer.println(" ____________________________________________________________________________________________________________________________________ ");
            writer.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

            writer.println();

            writer.println("                   .___.__  .__                         ________  ");
            writer.println("  _____   ____   __| _/|  | |  | _____    _____ _____   \\_____  \\ ");
            writer.println(" /     \\_/ __ \\ / __ | |  | |  | \\__  \\  /     \\\\__  \\   /  ____/ ");
            writer.println("|  Y Y  \\  ___// /_/ | |  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\ ");
            writer.println("|__|_|  /\\___  >____ | |____/____(____  /__|_|  (____  /\\_______ \\");
            writer.println("      \\/     \\/     \\/                \\/      \\/     \\/         \\/");
        }
        if(Objects.equals(modelName, "meditron")){
            writer.println("                   .___.__  __                        ");
            writer.println("  _____   ____   __| _/|__|/  |________  ____   ____  ");
            writer.println(" /     \\_/ __ \\ / __ | |  \\   __\\_  __ \\/  _ \\ /    \\ ");
            writer.println("|  Y Y  \\  ___// /_/ | |  ||  |  |  | \\(  <_> )   |  \\");
            writer.println("|__|_|  /\\___  >____ | |__||__|  |__|   \\____/|___|  /");
            writer.println("      \\/     \\/     \\/                             \\/ ");
            writer.println();
        }
    }
    protected static void modelPrint(String modelName) {
            if (Objects.equals(modelName, "llama2")) {

                System.out.println("  ___________________ _______  _____________________    _____  .____                   _____   ________  ________  ___________.____       _________    ");
                System.out.println(" /  _____/\\_   _____/ \\      \\ \\_   _____/\\______   \\  /  _  \\ |    |                 /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/    ");
                System.out.println("/   \\  ___ |    __)_  /   |   \\ |    __)_  |       _/ /  /_\\  \\|    |       ______   /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\     ");
                System.out.println("\\    \\_\\  \\|        \\/    |    \\|        \\ |    |   \\/    |    \\    |___   /_____/  /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\    ");
                System.out.println(" \\______  /_______  /\\____|__  /_______  / |____|_  /\\____|__  /_______ \\           \\____|__  /\\_______  /_______  /_______  /|_______ \\/_______  /    ");
                System.out.println("        \\/        \\/         \\/        \\/         \\/         \\/        \\/                   \\/         \\/        \\/        \\/         \\/        \\/     ");
                System.out.println(" ______________________________________________________________________________________________________________________________________________________ ");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

                System.out.println();


                System.out.println(".__  .__                         ________  ");
                System.out.println("|  | |  | _____    _____ _____   \\_____  \\");
                System.out.println("|  | |  | \\__  \\  /     \\\\__  \\   /  ____/");
                System.out.println("|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\");
                System.out.println("|____/____(____  /__|_|  (____  /\\_______ \\");
                System.out.println("               \\/      \\/     \\/         \\/");
                System.out.println();
            }
            if (Objects.equals(modelName, "codellama")) {

                System.out.println("_________  ________  ________  ___________              _____   ________  ________  ___________.____       _________");
                System.out.println("\\_   ___ \\ \\_____  \\ \\______ \\ \\_   _____/             /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/");
                System.out.println("/    \\  \\/  /   |   \\ |    |  \\ |    __)_    ______   /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\");
                System.out.println("\\     \\____/    |    \\|    `   \\|        \\  /_____/  /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\");
                System.out.println(" \\______  /\\_______  /_______  /_______  /           \\____|__  /\\_______  /_______  /_______  /|_______ \\/_______  /");
                System.out.println("        \\/         \\/        \\/        \\/                    \\/         \\/        \\/        \\/         \\/        \\/");
                System.out.println(" __________________________________________________________________________________________________________________");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

                System.out.println();

                System.out.println("                 .___     .__  .__                         ");
                System.out.println("  ____  ____   __| _/____ |  | |  | _____    _____ _____   ");
                System.out.println("_/ ___\\/  _ \\ / __ |/ __ \\|  | |  | \\__  \\  /     \\\\__  \\  ");
                System.out.println("\\  \\__(  <_> ) /_/ \\  ___/|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_");
                System.out.println(" \\___  >____/\\____ |\\___  >____/____(____  /__|_|  (____  /");
                System.out.println("     \\/           \\/    \\/               \\/      \\/     \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "llama2-uncensored")) {
                System.out.println(" ____ __________  _________ ___________ _______    _________________ _____________________________       _____   ________  ________  ___________.____       _________");
                System.out.println("|    |   \\      \\ \\_   ___ \\\\_   _____/ \\      \\  /   _____/\\_____  \\\\______   \\_   _____/\\______ \\     /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/");
                System.out.println("|    |   /   |   \\/    \\  \\/ |    __)_  /   |   \\ \\_____  \\  /   |   \\|       _/|    __)_  |    |  \\   /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\ ");
                System.out.println("|    |  /    |    \\     \\____|        \\/    |    \\/        \\/    |    \\    |   \\|        \\ |    `   \\ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\");
                System.out.println("|______/\\____|__  /\\______  /_______  /\\____|__  /_______  /\\_______  /____|_  /_______  //_______  / \\____|__  /\\_______  /_______  /|_______  /|_______ \\/_______  /");
                System.out.println("                \\/        \\/        \\/         \\/        \\/         \\/       \\/        \\/         \\/          \\/         \\/        \\/        \\/         \\/        \\/ ");
                System.out.println(" ____________________________________________________________________________________________________________________________________________________________________________________ ");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

                System.out.println();


                System.out.println(".__  .__                         ________                                                                           .___");
                System.out.println("|  | |  | _____    _____ _____   \\_____  \\           __ __  ____   ____  ____   ____   _________________   ____   __| _/");
                System.out.println("|  | |  | \\__  \\  /     \\__  \\   /  ____/   ______ |  |  \\/    \\_/ ___\\/ __ \\ /    \\ /  ___/  _ \\_  __ \\/ __ \\ / __ | ");
                System.out.println("|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\  /_____/ |  |  /   |  \\  \\__\\  ___/|   |  \\___ (  <_> )  | \\/\\  ___// /_/ | ");
                System.out.println("|____/____(____  /__|_|  (____  /\\_______ \\         |____/|___|  /\\___  >___  >___|  /____  >____/|__|    \\___  >____ | ");
                System.out.println("               \\/      \\/     \\/         \\/                    \\/     \\/    \\/     \\/     \\/                  \\/     \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "mistral:7.3b")) {
                System.out.println("        .__          __                .__   ");
                System.out.println("  _____ |__| _______/  |_____________  |  |  ");
                System.out.println(" /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |  ");
                System.out.println("|  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__");
                System.out.println("|__|_|  /__/____  > |__|  |__|  (____  /____/");
                System.out.println("      \\/        \\/                   \\/       ");
                System.out.println();
            }
            if (Objects.equals(modelName, "dolphin-mistral")) {
                System.out.println("   .___     .__         .__    .__                         .__          __                .__   ");
                System.out.println("  __| _/____ |  | ______ |  |__ |__| ____             _____ |__| _______/  |_____________  |  |  ");
                System.out.println(" / __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\   ______  /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |  ");
                System.out.println("/ /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\ /_____/ |  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__");
                System.out.println("\\____ |\\____/|____/   __/|___|  /__|___|  /         |__|_|  /__/____  > |__|  |__|  (____  /____/");
                System.out.println("     \\/           |__|        \\/        \\/                \\/        \\/                   \\/       ");
                System.out.println();
            }
            if (Objects.equals(modelName, "mistral-openorca")) {
                System.out.println("        .__          __                .__                                                                    ");
                System.out.println("  _____ |__| _______/  |_____________  |  |             ____ ______   ____   ____   ___________   ____ _____   ");
                System.out.println(" /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |    ______  /  _ \\\\____ \\_/ __ \\ /    \\ /  _ \\_  __ \\_/ ___\\\\__  \\  ");
                System.out.println("|  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__ /_____/ (  <_> )  |_> >  ___/|   |  (  <_> )  | \\/\\  \\___ / __ \\_");
                System.out.println("|__|_|  /__/____  > |__|  |__|  (____  /____/          \\____/|   __/ \\___  >___|  /\\____/|__|    \\___  >____  /");
                System.out.println("      \\/        \\/                   \\/                      |__|        \\/     \\/                   \\/     \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "zephyr")) {
                System.out.println("                     .__                   ");
                System.out.println("________ ____ ______ |  |__ ___.__._______ ");
                System.out.println("\\___   // __ \\____ \\|  |  <   |  |\\_  __ \\");
                System.out.println(" /    /\\  ___/|  |_> >   Y  \\___  | |  | \\/");
                System.out.println("/_____ \\___  >   __/|___|  / ____| |__|   ");
                System.out.println("      \\/    \\/|__|        \\/\\/            ");
                System.out.println();
            }
            if (Objects.equals(modelName, "mixtral")) {
                System.out.println("        .__          __                .__   ");
                System.out.println("  _____ |__|__  ____/  |_____________  |  |  ");
                System.out.println(" /     \\|  \\  \\/  /\\   __\\_  __ \\__  \\ |  |  ");
                System.out.println("|  Y Y  \\  |>    <  |  |  |  | \\// __ \\|  |__");
                System.out.println("|__|_|  /__/__/\\_ \\ |__|  |__|  (____  /____/");
                System.out.println("      \\/         \\/                  \\/       ");
                System.out.println();
            }
            if (Objects.equals(modelName, "dolphin-mixtral")) {
                System.out.println("    .___     .__         .__    .__                         .__          __                .__   ");
                System.out.println("  __| _/____ |  | ______ |  |__ |__| ____             _____ |__|__  ____/  |_____________  |  |  ");
                System.out.println(" / __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\   ______  /     \\|  \\  \\/  /\\   __\\_  __ \\__  \\ |  |  ");
                System.out.println("/ /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\ /_____/ |  Y Y  \\  |>    <  |  |  |  | \\// __ \\|  |__");
                System.out.println("\\____ |\\____/|____/   __/|___|  /__|___|  /         |__|_|  /__/__/\\_ \\ |__|  |__|  (____  /____/");
                System.out.println("     \\/           |__|        \\/        \\/                \\/         \\/                  \\/       ");
                System.out.println();
            }
            if (Objects.equals(modelName, "dolphin-phi")) {
                System.out.println("    .___     .__         .__    .__                        .__    .__ ");
                System.out.println("  __| _/____ |  | ______ |  |__ |__| ____           ______ |  |__ |__|");
                System.out.println(" / __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\   ______ \\____ \\|  |  \\|  |");
                System.out.println("/ /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\ /_____/ |  |_> >   Y  \\  |");
                System.out.println("\\____ |\\____/|____/   __/|___|  /__|___|  /         |   __/|___|  /__|");
                System.out.println("     \\/           |__|        \\/        \\/          |__|        \\/     ");
                System.out.println();
            }
            if (Objects.equals(modelName, "phi")) {
                System.out.println("       .__    .__ ");
                System.out.println("______ |  |__ |__|");
                System.out.println("\\____ \\|  |  \\|  |");
                System.out.println("|  |_> >   Y  \\  |");
                System.out.println("|   __/|___|  /__|");
                System.out.println("|__|        \\/     ");
                System.out.println();
            }
            if (Objects.equals(modelName, "neural-chat")) {
                System.out.println("                                  .__                   .__            __   ");
                System.out.println("  ____   ____  __ ______________  |  |             ____ |  |__ _____ _/  |_ ");
                System.out.println(" /    \\_/ __ \\|  |  \\_  __ \\__  \\ |  |    ______ _/ ___\\|  |  \\\\__  \\\\   __\\");
                System.out.println("|   |  \\  ___/|  |  /|  | \\// __ \\|  |__ /_____/ \\  \\___|   Y  \\/ __ \\|  |  ");
                System.out.println("|___|  /\\___  >____/ |__|  (____  /____/          \\___  >___|  (____  /__|  ");
                System.out.println("     \\/     \\/                  \\/                    \\/     \\/     \\/      ");
                System.out.println();
            }
            if (Objects.equals(modelName, "starling-lm")) {
                System.out.println("          __               .__  .__                         .__           ");
                System.out.println("  _______/  |______ _______|  | |__| ____    ____           |  |   _____  ");
                System.out.println(" /  ___/\\   __\\__  \\\\_  __ \\  | |  |/    \\  / ___\\   ______ |  |  /     \\ ");
                System.out.println(" \\___ \\  |  |  / __ \\|  | \\/  |_|  |   |  \\/ /_/  > /_____/ |  |_|  Y Y  \\");
                System.out.println("/____  > |__| (____  /__|  |____/__|___|  /\\___  /          |____/__|_|  /");
                System.out.println("     \\/            \\/                   \\//_____/                      \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "orca-mini")) {
                System.out.println("                                              .__       .__ ");
                System.out.println("  ___________   ____ _____              _____ |__| ____ |__|");
                System.out.println(" /  _ \\_  __ \\_/ ___\\__  \\    ______  /     \\|  |/    \\|  |");
                System.out.println("(  <_> )  | \\/\\  \\___ / __ \\_ /_____/ |  Y Y  \\  |   |  \\  |");
                System.out.println(" \\____/|__|    \\___  >____  /         |__|_|  /__|___|  /__|");
                System.out.println("                   \\/     \\/                \\/        \\/     ");
                System.out.println();
            }
            if (Objects.equals(modelName, "deepseek-coder")) {
                System.out.println("    .___                                        __                              .___            ");
                System.out.println("  __| _/____   ____ ______  ______ ____   ____ |  | __           ____  ____   __| _/___________ ");
                System.out.println(" / __ |/ __ \\_/ __ \\____ \\/  ___// __ \\_/ __ \\|  |/ /  ______ _/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
                System.out.println("/ /_/ \\  ___/\\  ___/|  |_> >___ \\  ___/\\  ___/|    <  /_____/ \\  \\__(  <_> ) /_/ \\  ___/|  | \\/");
                System.out.println("\\____ |\\___  >\\___  >   __/____  >\\___  >\\___  >__|_ \\          \\___  >____/\\____ |\\___  >__|   ");
                System.out.println("     \\/    \\/     \\/|__|       \\/     \\/     \\/     \\/              \\/           \\/    \\/        ");
                System.out.println();
            }
            if (Objects.equals(modelName, "vicuna")) {
                System.out.println("      .__                            ");
                System.out.println("___  _|__| ____  __ __  ____ _____   ");
                System.out.println("\\  \\/ /  |/ ___\\|  |  \\/    \\\\__  \\  ");
                System.out.println(" \\   /|  \\  \\___|  |  /   |  \\/ __ \\_");
                System.out.println("  \\_/ |__|\\___  >____/|___|  (____  /");
                System.out.println("              \\/           \\/     \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "wizard-vicuna-uncensored")) {
                System.out.println("        .__                         .___              .__                                                                                                     .___");
                System.out.println("__  _  _|__|____________ _______  __| _/        ___  _|__| ____  __ __  ____ _____             __ __  ____   ____  ____   ____   _________________   ____   __| _/");
                System.out.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ |  ______ \\  \\/ /  |/ ___\\|  |  \\/    \\__  \\    ______ |  |  \\/    \\_/ ___\\/ __ \\ /    \\ /  ___/  _ \\_  __ \\_/ __ \\ / __ | ");
                System.out.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | /_____/  \\   /|  \\  \\___|  |  /   |  \\/ __ \\_ /_____/ |  |  /   |  \\  \\__\\  ___/|   |  \\___ (  <_> )  | \\/\\  ___// /_/ | ");
                System.out.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ |           \\_/ |__|\\___  >____/|___|  (____  /         |____/|___|  /\\___  >___  >___|  /____  >____/|__|    \\___  >____ | ");
                System.out.println("                 \\/     \\/           \\/                       \\/           \\/     \\/                     \\/     \\/    \\/     \\/     \\/                  \\/     \\/  ");
                System.out.println();
            }
            if(Objects.equals(modelName, "tinydolphin")){
                System.out.println("  __  .__                 .___     .__         .__    .__        ");
                System.out.println("_/  |_|__| ____ ___.__. __| _/____ |  | ______ |  |__ |__| ____  ");
                System.out.println("\\   __\\  |/    <   |  |/ __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\ ");
                System.out.println(" |  | |  |   |  \\___  / /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\");
                System.out.println(" |__| |__|___|  / ____\\____ |\\____/|____/   __/|___|  /__|___|  /");
                System.out.println("              \\/\\/         \\/           |__|        \\/        \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "wizardlm-uncensored")){
                System.out.println("        .__                         .___.__                                                                                    .___");
                System.out.println("__  _  _|__|____________ _______  __| _/|  |   _____            __ __  ____   ____  ____   ____   _________________   ____   __| _/");
                System.out.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ | |  |  /     \\   ______ |  |  \\/    \\_/ ___\\/ __ \\ /    \\ /  ___/  _ \\_  __ \\/ __ \\ / __ | ");
                System.out.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | |  |_|  Y Y  \\ /_____/ |  |  /   |  \\  \\__\\  ___/|   |  \\___ (  <_> )  | \\/\\  ___// /_/ | ");
                System.out.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ | |____/__|_|  /         |____/|___|  /\\___  >___  >___|  /____  >____/|__|    \\___  >____ | ");
                System.out.println("                 \\/     \\/           \\/            \\/                     \\/     \\/    \\/     \\/     \\/                  \\/     \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "llava:7b")) {
                System.out.println(".__  .__                       ");
                System.out.println("|  | |  | _____ ___  _______   ");
                System.out.println("|  | |  | \\__  \\\\  \\/ /\\__  \\  ");
                System.out.println("|  |_|  |__/ __ \\\\   /  / __ \\_");
                System.out.println("|____/____(____  /\\_/  (____  /");
                System.out.println("               \\/           \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "gemma:2b")) {
                System.out.println("                                       ");
                System.out.println("   ____   ____   _____   _____ _____   ");
                System.out.println("  / ___\\_/ __ \\ /     \\ /     \\__  \\  ");
                System.out.println(" / /_/  >  ___/|  Y Y  \\  Y Y  \\/ __ \\_");
                System.out.println(" \\___  / \\___  >__|_|  /__|_|  (____  /");
                System.out.println("/_____/      \\/      \\/      \\/     \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "openhermes")) {
                System.out.println("                            .__                                        ");
                System.out.println("  ____ ______   ____   ____ |  |__   ___________  _____   ____   ______");
                System.out.println(" /  _ \\____ \\_/ __ \\ /    \\|  |  \\_/ __ \\_  __ \\/     \\_/ __ \\ /  ___/");
                System.out.println("(  <_> )  |_> >  ___/|   |  \\   Y  \\  ___/|  | \\/  Y Y  \\  ___/ \\___ \\ ");
                System.out.println(" \\____/|   __/ \\___  >___|  /___|  /\\___  >__|  |__|_|  /\\___  >____  >");
                System.out.println("       |__|        \\/     \\/     \\/     \\/            \\/     \\/     \\/ ");
                System.out.println();
            }
            if (Objects.equals(modelName, "tinyllama")) {
                System.out.println("  __  .__              .__  .__                         ");
                System.out.println("_/  |_|__| ____ ___.__.|  | |  | _____    _____ _____   ");
                System.out.println("\\   __\\  |/    <   |  ||  | |  | \\__  \\  /     \\\\__  \\  ");
                System.out.println(" |  | |  |   |  \\___  ||  |_|  |__/ __ \\|  Y Y  \\/ __ \\_");
                System.out.println(" |__| |__|___|  / ____||____/____(____  /__|_|  (____  /");
                System.out.println("              \\/\\/                    \\/      \\/     \\/ ");
            }
            if(Objects.equals(modelName, "openchat")){
                System.out.println("                                   .__            __   ");
                System.out.println("  ____ ______   ____   ____   ____ |  |__ _____ _/  |_ ");
                System.out.println(" /  _ \\____ \\_/ __ \\ /    \\_/ ___\\|  |  \\\\__  \\\\   __\\");
                System.out.println("(  <_> )  |_> >  ___/|   |  \\  \\___|   Y  \\/ __ \\|  |  ");
                System.out.println(" \\____/|   __/ \\___  >___|  /\\___  >___|  (____  /__|  ");
                System.out.println("       |__|        \\/     \\/     \\/     \\/     \\/      ");
                System.out.println();
            }
            if(Objects.equals(modelName, "orca2")){
                System.out.println("                             ________  ");
                System.out.println("  ___________   ____ _____   \\_____  \\ ");
                System.out.println(" /  _ \\_  __ \\_/ ___\\\\__  \\   /  ____/ ");
                System.out.println("(  <_> )  | \\/\\  \\___ / __ \\_/       \\ ");
                System.out.println(" \\____/|__|    \\___  >____  /\\_______ \\");
                System.out.println("                   \\/     \\/         \\/");
                System.out.println();
            }
            if(Objects.equals(modelName, "falcon")){
                System.out.println("  _____       .__                       ");
                System.out.println("_/ ____\\____  |  |   ____  ____   ____  ");
                System.out.println("\\   __\\\\__  \\ |  | _/ ___\\/  _ \\ /    \\ ");
                System.out.println(" |  |   / __ \\|  |_\\  \\__(  <_> )   |  \\");
                System.out.println(" |__|  (____  /____/\\___  >____/|___|  /");
                System.out.println("            \\/          \\/           \\/ ");
            }
            if(Objects.equals(modelName, "everythinglm")){
                System.out.println("                                   __  .__    .__               .__           ");
                System.out.println("  _______  __ ___________ ___.__._/  |_|  |__ |__| ____    ____ |  |   _____  ");
                System.out.println("_/ __ \\  \\/ // __ \\_  __ <   |  |\\   __\\  |  \\|  |/    \\  / ___\\|  |  /     \\ ");
                System.out.println("\\  ___/\\   /\\  ___/|  | \\/\\___  | |  | |   Y  \\  |   |  \\/ /_/  >  |_|  Y Y  \\");
                System.out.println(" \\___  >\\_/  \\___  >__|   / ____| |__| |___|  /__|___|  /\\___  /|____/__|_|  /");
                System.out.println("     \\/          \\/       \\/                \\/        \\//_____/            \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "bakllava")){
                System.out.println("___.           __   .__  .__                       ");
                System.out.println("\\_ |__ _____  |  | _|  | |  | _____ ___  _______   ");
                System.out.println(" | __ \\__  \\ |  |/ /  | |  | \\__  \\\\  \\/ /\\__  \\  ");
                System.out.println(" | \\_\\ \\/ __ \\|    <|  |_|  |__/ __ \\\\   /  / __ \\_");
                System.out.println(" |___  (____  /__|_ \\____/____(____  /\\_/  (____  /");
                System.out.println("     \\/     \\/     \\/              \\/           \\/ ");
            }
            if(Objects.equals(modelName, "solar")){
                System.out.println("             .__                ");
                System.out.println("  __________ |  | _____ _______ ");
                System.out.println(" /  ___/  _ \\|  | \\__  \\\\_  __ \\");
                System.out.println(" \\___ \\(  <_> )  |__/ __ \\|  | \\/");
                System.out.println("/____  >____/|____(____  /__|   ");
                System.out.println("     \\/                \\/       ");
            }
            if(Objects.equals(modelName, "stable-beluga")){
                System.out.println("          __        ___.   .__                  ___.          .__                      ");
                System.out.println("  _______/  |______ \\_ |__ |  |   ____          \\_ |__   ____ |  |  __ __  _________   ");
                System.out.println(" /  ___/\\   __\\__  \\ | __ \\|  | _/ __ \\   ______ | __ \\_/ __ \\|  | |  |  \\/ ___\\__  \\  ");
                System.out.println(" \\___ \\  |  |  / __ \\| \\_\\ \\  |_\\  ___/  /_____/ | \\_\\ \\  ___/|  |_|  |  / /_/  > __ \\_");
                System.out.println("/____  > |__| (____  /___  /____/\\___  >         |___  /\\___  >____/____/\\___  (____  /");
                System.out.println("     \\/            \\/    \\/          \\/              \\/     \\/          /_____/     \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "yarn-mistral")){
                System.out.println("                                              .__          __                .__   ");
                System.out.println(" ___.__._____ _______  ____             _____ |__| _______/  |_____________  |  |  ");
                System.out.println("<   |  |\\__  \\\\_  __ \\/    \\   ______  /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |  ");
                System.out.println(" \\___  | / __ \\|  | \\/   |  \\ /_____/ |  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__");
                System.out.println(" / ____|/ (____  /__|  |___|  /         |__|_|  /__/____  > |__|  |__|  (____  /____/");
                System.out.println(" \\/          \\/           \\/                \\/        \\/                   \\/       ");
                System.out.println();
            }
            if(Objects.equals(modelName, "samantha-mistral")){
                System.out.println("                                      __  .__                             .__          __                .__   ");
                System.out.println("  ___________    _____ _____    _____/  |_|  |__ _____              _____ |__| _______/  |_____________  |  |  ");
                System.out.println(" /  ___/\\__  \\  /     \\\\__  \\  /    \\   __\\  |  \\\\__  \\    ______  /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  |  ");
                System.out.println(" \\___ \\  / __ \\|  Y Y  \\/ __ \\|   |  \\  | |   Y  \\/ __ \\_ /_____/ |  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |__");
                System.out.println("/____  >(____  /__|_|  (____  /___|  /__| |___|  (____  /         |__|_|  /__/____  > |__|  |__|  (____  /____/");
                System.out.println("     \\/      \\/      \\/     \\/     \\/          \\/     \\/                \\/        \\/                   \\/       ");
                System.out.println();
            }
            if(Objects.equals(modelName, "stablelm-zephyr")){
                System.out.println("          __        ___.   .__         .__                                         .__                   ");
                System.out.println("  _______/  |______ \\_ |__ |  |   ____ |  |   _____           ________ ____ ______ |  |__ ___.__._______ ");
                System.out.println(" /  ___/\\   __\\__  \\ | __ \\|  | _/ __ \\|  |  /     \\   ______ \\___   // __ \\____ \\|  |  <   |  |\\_  __ \\");
                System.out.println(" \\___ \\  |  |  / __ \\| \\_\\ \\  |_\\  ___/|  |_|  Y Y  \\ /_____/  /    /\\  ___/|  |_> >   Y  \\___  | |  | \\/");
                System.out.println("/____  > |__| (____  /___  /____/\\___  >____/__|_|  /         /_____ \\\\___  >   __/|___|  / ____| |__|   ");
                System.out.println("     \\/            \\/    \\/          \\/           \\/                \\/    \\/|__|        \\/\\/              ");
                System.out.println();
            }
            if(Objects.equals(modelName, "wizard-vicuna")){
                System.out.println("        .__                         .___              .__                            ");
                System.out.println("__  _  _|__|____________ _______  __| _/        ___  _|__| ____  __ __  ____ _____   ");
                System.out.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ |  ______ \\  \\/ /  |/ ___\\|  |  \\/    \\\\__  \\  ");
                System.out.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | /_____/  \\   /|  \\  \\___|  |  /   |  \\/ __ \\_");
                System.out.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ |           \\_/ |__|\\___  >____/|___|  (____  /");
                System.out.println("                 \\/     \\/           \\/                       \\/           \\/     \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "yarn-llama2")){
                System.out.println("                                      .__  .__                         ________  ");
                System.out.println(" ___.__._____ _______  ____           |  | |  | _____    _____ _____   \\_____  \\ ");
                System.out.println("<   |  |\\__  \\\\_  __ \\/    \\   ______ |  | |  | \\__  \\  /     \\\\__  \\   /  ____/ ");
                System.out.println(" \\___  | / __ \\|  | \\/   |  \\ /_____/ |  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\");
                System.out.println(" / ____|(____  /__|  |___|  /         |____/____(____  /__|_|  (____  /\\_______ \\");
                System.out.println(" \\/          \\/           \\/                         \\/      \\/     \\/         \\/");
                System.out.println();

            }
            if(Objects.equals(modelName, "notux")){
                System.out.println("               __                ");
                System.out.println("  ____   _____/  |_ __ _____  ___");
                System.out.println(" /    \\ /  _ \\   __\\  |  \\  \\/  /");
                System.out.println("|   |  (  <_> )  | |  |  />    < ");
                System.out.println("|___|  /\\____/|__| |____//__/\\_ \\");
                System.out.println("     \\/                        \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "alfred")){
                System.out.println("       .__   _____                   .___");
                System.out.println("_____  |  |_/ ____\\______   ____   __| _/");
                System.out.println("\\__  \\ |  |\\   __\\\\_  __ \\_/ __ \\ / __ | ");
                System.out.println(" / __ \\|  |_|  |   |  | \\/\\  ___// /_/ | ");
                System.out.println("(____  /____/__|   |__|    \\___  >____ | ");
                System.out.println("     \\/                        \\/     \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "megadolphin")){
                System.out.println("                                 .___     .__         .__    .__        ");
                System.out.println("  _____   ____   _________     __| _/____ |  | ______ |  |__ |__| ____  ");
                System.out.println(" /     \\_/ __ \\ / ___\\__  \\   / __ |/  _ \\|  | \\____ \\|  |  \\|  |/    \\ ");
                System.out.println("|  Y Y  \\  ___// /_/  > __ \\_/ /_/ (  <_> )  |_|  |_> >   Y  \\  |   |  \\");
                System.out.println("|__|_|  /\\___  >___  (____  /\\____ |\\____/|____/   __/|___|  /__|___|  /");
                System.out.println("      \\/     \\/_____/     \\/      \\/           |__|        \\/        \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "wizardlm:7b-q4_0")){
                System.out.println("        .__                         .___.__           ");
                System.out.println("__  _  _|__|____________ _______  __| _/|  |   _____  ");
                System.out.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ | |  |  /     \\ ");
                System.out.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | |  |_|  Y Y  \\");
                System.out.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ | |____/__|_|  /");
                System.out.println("                 \\/     \\/           \\/            \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "mistrallite")){
                System.out.println("        .__          __                .__  .__  .__  __          ");
                System.out.println("  _____ |__| _______/  |_____________  |  | |  | |__|/  |_  ____  ");
                System.out.println(" /     \\|  |/  ___/\\   __\\_  __ \\__  \\ |  | |  | |  \\   __\\/ __ \\ ");
                System.out.println("|  Y Y  \\  |\\___ \\  |  |  |  | \\// __ \\|  |_|  |_|  ||  | \\  ___/ ");
                System.out.println("|__|_|  /__/____  > |__|  |__|  (____  /____/____/__||__|  \\___  >");
                System.out.println("      \\/        \\/                   \\/                        \\/ ");

            }
            if (Objects.equals(modelName, "wizardcoder")) {
                System.out.println("        .__                         .___               .___            ");
                System.out.println("__  _  _|__|____________ _______  __| _/____  ____   __| _/___________ ");
                System.out.println("\\ \\/ \\/ /  \\___   /\\__  \\\\  __ \\/ __ |/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
                System.out.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ \\  \\__(  <_> ) /_/ \\  ___/|  | \\/");
                System.out.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ |\\___  >____/\\____ |\\___  >__|   ");
                System.out.println("                 \\/     \\/           \\/    \\/           \\/    \\/       ");
                System.out.println();
            }
            if(Objects.equals(modelName, "phind-codellama")){
                System.out.println("       .__    .__            .___                         .___     .__  .__                         ");
                System.out.println("______ |  |__ |__| ____    __| _/          ____  ____   __| _/____ |  | |  | _____    _____ _____   ");
                System.out.println("\\____ \\|  |  \\|  |/    \\  / __ |  ______ _/ ___\\/  _ \\ / __ |/ __ \\|  | |  | \\__  \\  /     \\\\__  \\ ");
                System.out.println("|  |_> >   Y  \\  |   |  \\/ /_/ | /_____/ \\  \\__(  <_> ) /_/ \\  ___/|  |_|  |__/ __ \\|  Y Y  \\/ __ \\");
                System.out.println("|   __/|___|  /__|___|  /\\____ |          \\___  >____/\\____ |\\___  >____/____(____  /__|_|  (____  /");
                System.out.println("|__|        \\/        \\/      \\/              \\/           \\/    \\/               \\/      \\/     \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "codeup")){
                System.out.println("                 .___                   ");
                System.out.println("  ____  ____   __| _/____  __ ________  ");
                System.out.println("_/ ___\\/  _ \\ / __ |/ __ \\|  |  \\____ \\ ");
                System.out.println("\\  \\__(  <_> ) /_/ \\  ___/|  |  /  |_> >");
                System.out.println(" \\___  >____/\\____ |\\___  >____/|   __/ ");
                System.out.println("     \\/           \\/    \\/      |__|    ");
                System.out.println();
            }
            if(Objects.equals(modelName, "starcoder")){
                System.out.println("          __                                 .___            ");
                System.out.println("  _______/  |______ _______   ____  ____   __| _/___________ ");
                System.out.println(" /  ___/\\   __\\__  \\\\_  __ \\_/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
                System.out.println(" \\___ \\  |  |  / __ \\|  | \\/\\  \\__(  <_> ) /_/ \\  ___/|  | \\/");
                System.out.println("/____  > |__| (____  /__|    \\___  >____/\\____ |\\___  >__|   ");
                System.out.println("     \\/            \\/            \\/           \\/    \\/       ");
                System.out.println();
            }
            if(Objects.equals(modelName, "stable-code")){
                System.out.println("          __        ___.   .__                                    .___      ");
                System.out.println("  _______/  |______ \\_ |__ |  |   ____             ____  ____   __| _/____  ");
                System.out.println(" /  ___/\\   __\\__  \\ | __ \\|  | _/ __ \\   ______ _/ ___\\/  _ \\ / __ |/ __ \\ ");
                System.out.println(" \\___ \\  |  |  / __ \\| \\_\\ \\  |_\\  ___/  /_____/ \\  \\__(  <_> ) /_/ \\  ___/ ");
                System.out.println("/____  > |__| (____  /___  /____/\\___  >          \\___  >____/\\____ |\\___  >");
                System.out.println("     \\/            \\/    \\/          \\/               \\/           \\/    \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "magicoder")){
                System.out.println("                       .__                 .___            ");
                System.out.println("  _____ _____     ____ |__| ____  ____   __| _/___________ ");
                System.out.println(" /     \\__  \\   / ___\\|  |/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
                System.out.println("|  Y Y  \\/ __ \\_/ /_/  >  \\  \\__(  <_> ) /_/ \\  ___/|  | \\/");
                System.out.println("|__|_|  (____  /\\___  /|__|\\___  >____/\\____ |\\___  >__|   ");
                System.out.println("      \\/     \\/     \\/         \\/           \\/    \\/       ");
                System.out.println();
            }
            if(Objects.equals(modelName, "codebooga")){
                System.out.println("                 .___    ___.                               ");
                System.out.println("  ____  ____   __| _/____\\_ |__   ____   ____   _________   ");
                System.out.println("_/ ___\\/  _ \\ / __ |/ __ \\| __ \\ /  _ \\ /  _ \\ / ___\\__  \\  ");
                System.out.println("\\  \\__(  <_> ) /_/ \\  ___/| \\_\\ (  <_> |  <_> ) /_/  > __ \\_");
                System.out.println(" \\___  >____/\\____ |\\___  >___  /\\____/ \\____/\\___  (____  /");
                System.out.println("     \\/           \\/    \\/    \\/             /_____/     \\/ ");
            }
            if(Objects.equals(modelName, "nexusraven")){
                System.out.println("                                                                     ");
                System.out.println("  ____   ____ ___  _____ __  __________________ ___  __ ____   ____  ");
                System.out.println(" /    \\_/ __ \\\\  \\/  /  |  \\/  ___/\\_  __ \\__  \\\\  \\/ // __ \\ /    \\ ");
                System.out.println("|   |  \\  ___/ >    <|  |  /\\___ \\  |  | \\// __ \\\\   /\\  ___/|   |  \\");
                System.out.println("|___|  /\\___  >__/\\_ \\____//____  > |__|  (____  /\\_/  \\___  >___|  /");
                System.out.println("     \\/     \\/      \\/          \\/             \\/          \\/     \\/ ");

            }
            if (Objects.equals(modelName, "llama2-chinese")) {

                System.out.println(" _______   ________    _______            ___________ _______    ________.____    .___  _________ ___ ___  ");
                System.out.println(" \\      \\  \\_____  \\   \\      \\           \\_   _____/ \\      \\  /  _____/|    |   |   |/   _____//   |   \\ ");
                System.out.println(" /   |   \\  /   |   \\  /   |   \\   ______  |    __)_  /   |   \\/   \\  ___|    |   |   |\\_____  \\/    ~    \\");
                System.out.println("/    |    \\/    |    \\/    |    \\ /_____/  |        \\/    |    \\    \\_\\  \\    |___|   |/        \\    Y    /");
                System.out.println("\\____|__  /\\_______  /\\____|__  /         /_______  /\\____|__  /\\______  /_______ \\___/_______  /\\___|_  / ");
                System.out.println("        \\/         \\/         \\/                  \\/         \\/        \\/        \\/           \\/       \\/  ");
                System.out.println(" ______________________________________________________________________________________________________   ");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/    ");

                System.out.println();

                System.out.println(".__  .__                         ________                  .__    .__                             ");
                System.out.println("|  | |  | _____    _____ _____   \\_____  \\            ____ |  |__ |__| ____   ____   ______ ____  ");
                System.out.println("|  | |  | \\__  \\  /     \\__  \\   /  ____/   ______ _/ ___\\|  |  \\|  |/    \\_/ __ \\ /  ___// __ \\ ");
                System.out.println("|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\  /_____/ \\  \\___|   Y  \\  |   |  \\  ___/ \\___ \\\\  ___/ ");
                System.out.println("|____/____(____  /__|_|  (____  /\\_______ \\          \\___  >___|  /__|___|  /\\___  >____  >\\___  >");
                System.out.println("               \\/      \\/     \\/         \\/              \\/     \\/        \\/     \\/     \\/     \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "qwen:0.5b")){
                System.out.println("  ________  _  __ ____   ____  ");
                System.out.println(" / ____/\\ \\/ \\/ // __ \\ /    \\ ");
                System.out.println("< <_|  | \\     /\\  ___/|   |  \\");
                System.out.println(" \\__   |  \\/\\_/  \\___  >___|  /");
                System.out.println("    |__|             \\/     \\/ ");
                System.out.println();
            }
            if(Objects.equals(modelName, "yi")){
                System.out.println("        .__ ");
                System.out.println("  ___.__.|__|");
                System.out.println(" <   |  ||  |");
                System.out.println("  \\___  ||  |");
                System.out.println("  / ____||__|");
                System.out.println("  \\/        ");
                System.out.println();
            }
            if(Objects.equals(modelName, "nous-hermes")){
                System.out.println("                                     .__                                        ");
                System.out.println("  ____   ____  __ __  ______         |  |__   ___________  _____   ____   ______");
                System.out.println(" /    \\ /  _ \\|  |  \\/  ___/  ______ |  |  \\_/ __ \\_  __ \\/     \\_/ __ \\ /  ___/");
                System.out.println("|   |  (  <_> )  |  /\\___ \\  /_____/ |   Y  \\  ___/|  | \\/  Y Y  \\  ___/ \\___ \\ ");
                System.out.println("|___|  /\\____/|____/____  >         |___|  /\\___  >__|  |__|_|  /\\___  >____  >");
                System.out.println("     \\/                  \\/               \\/     \\/            \\/     \\/     \\/");
                System.out.println();
            }
            if(Objects.equals(modelName, "stablelm2")){
                System.out.println("          __        ___.   .__         .__           ________  ");
                System.out.println("  _______/  |______ \\_ |__ |  |   ____ |  |   _____  \\_____  \\ ");
                System.out.println(" /  ___/\\   __\\__  \\ | __ \\|  | _/ __ \\|  |  /     \\  /  ____/ ");
                System.out.println(" \\___ \\  |  |  / __ \\| \\_\\ \\  |_\\  ___/|  |_|  Y Y  \\/       \\ ");
                System.out.println("/____  > |__| (____  /___  /____/\\___  >____/__|_|  /\\_______ \\");
                System.out.println("     \\/            \\/    \\/          \\/           \\/         \\/");
                System.out.println();
            }
            if (Objects.equals(modelName, "deepseek-llm")) {
                System.out.println("   _____      ___________________ ___           _________  ________  ________  ___________            _____   ________  ________  ___________.____       _________ ");
                System.out.println("  /     \\    /  _  \\__    ___/   |   \\          \\_   ___ \\ \\_____  \\ \\______ \\ \\_   _____/           /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/ ");
                System.out.println(" /  \\ /  \\  /  /_\\  \\|    | /    ~    \\  ______ /    \\  \\/  /   |   \\ |    |  \\ |    __)_   ______  /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\  ");
                System.out.println("/    Y    \\/    |    \\    | \\    Y    / /_____/ \\     \\____/    |    \\|    `   \\|        \\ /_____/ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\ ");
                System.out.println("\\____|__  /\\____|__  /____|  \\___|_  /           \\______  /\\_______  /_______  /_______  /         \\____|__  /\\_______  /_______  /|_______ \\/_______  / ");
                System.out.println("        \\/         \\/              \\/                   \\/         \\/        \\/        \\/                  \\/         \\/        \\/        \\/         \\/        \\/  ");
                System.out.println(" _________________________________________________________________________________________________________________________________________________________________");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

                System.out.println();

                System.out.println("   .___                                        __             .__  .__           ");
                System.out.println("  __| _/____   ____ ______  ______ ____   ____ |  | __         |  | |  |   _____  ");
                System.out.println(" / __ |/ __ \\_/ __ \\____ \\/  ___// __ \\_/ __ \\|  |/ /  ______ |  | |  |  /     \\ ");
                System.out.println("/ /_/ \\  ___/\\  ___/|  |_> >___ \\\\  ___/\\  ___/|    <  /_____/ |  |_|  |_|  Y Y  \\");
                System.out.println("\\____ |\\___  >\\___  >   __/____  >\\___  >\\___  >__|_ \\         |____/____/__|_|  /");
                System.out.println("     \\/    \\/     \\/|__|       \\/     \\/     \\/     \\/                         \\/ ");
            }
            if(Objects.equals(modelName, "llama-pro")){
                System.out.println(".__  .__                                                       ");
                System.out.println("|  | |  | _____    _____ _____            _____________  ____  ");
                System.out.println("|  | |  | \\__  \\  /     \\__  \\    ______ \\____ \\_  __ \\/  _ \\ ");
                System.out.println("|  |_|  |__/ __ \\|  Y Y  \\/ __ \\_ /_____/ |  |_> >  | \\(  <_> )");
                System.out.println("|____/____(____  /__|_|  (____  /         |   __/|__|   \\____/ ");
                System.out.println("               \\/      \\/     \\/          |__|                 ");
                System.out.println();
            }
            if (Objects.equals(modelName, "sqlcoder")) {
                System.out.println("  _________________  .____                 _____   ________  ________  ___________.____       _________");
                System.out.println(" /   _____/\\_____  \\ |    |               /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/");
                System.out.println(" \\_____  \\  /  / \\  \\|    |      ______  /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\ ");
                System.out.println(" /        \\/   \\_/.  \\    |___  /_____/ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\");
                System.out.println("/_______  /\\______\\ \\_/_______ \\         \\____|__  /\\_______  /_______  /|_______ \\/_______  /");
                System.out.println("        \\/        \\__>       \\/                 \\/         \\/        \\/         \\/        \\/");
                System.out.println(" ________________________________________________________________________________________________ ");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

                System.out.println();

                System.out.println("            .__                   .___            ");
                System.out.println("  ___________|  |   ____  ____   __| _/___________ ");
                System.out.println(" /  ___/ ____/  | _/ ___\\/  _ \\ / __ |/ __ \\_  __ \\");
                System.out.println(" \\___ < <_|  |  |_ \\__(  <_> ) /_/ \\  ___/|  | \\/");
                System.out.println("/____  >__   |____/\\___  >____/\\____ |\\___  >__|   ");
                System.out.println("     \\/   |__|         \\/           \\/    \\/       ");
            }
            if(Objects.equals(modelName, "duckdb-nsql")){
                System.out.println(".___             __       ._______.                                 .__   ");
                System.out.println("__| _/\\ __   ____ |  | __ __| _/\\__ |__             ____   ___________|  |  ");
                System.out.println("/ __ |  |  \\_/ ___\\|  |/ // __ |  | __ \\   ______  /    \\ /  ___/ ____/  |  ");
                System.out.println("/ /_/ |  |  /\\  \\___|    </ /_/ |  | \\_\\ \\ /_____/ |   |  \\\\___ < <_|  |  |__");
                System.out.println("\\____ |____/  \\___  >__|_ \\____ |  |___  /         |___|  /____  >__   |____/");
                System.out.println("     \\/           \\/     \\/    \\/      \\/               \\/     \\/   |__|     ");
                System.out.println();
            }
            if (Objects.equals(modelName, "wizard-math")) {
                System.out.println(" _____      ___________________ ___              _____   ________  ________  ___________.____       _________");
                System.out.println("  /     \\    /  _  \\__    ___/   |   \\            /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/");
                System.out.println(" /  \\ /  \\  /  /_\\  \\|    | /    ~    \\  ______  /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\ ");
                System.out.println("/    Y    \\/    |    \\    | \\    Y    / /_____/ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\");
                System.out.println("\\____|__  /\\____|__  /____|  \\___|_  /          \\____|__  /\\_______  /_______  /|_______ \\/_______  /");
                System.out.println("        \\/         \\/              \\/                   \\/         \\/        \\/        \\/        \\/ ");
                System.out.println(" ________________________________________________________________________________________________ ");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

                System.out.println();

                System.out.println("        .__                         .___                        __  .__     ");
                System.out.println("__  _  _|__|____________ _______  __| _/          _____ _____ _/  |_|  |__  ");
                System.out.println("\\ \\/ \\/ /  \\___   /\\__  \\_  __ \\/ __ |  ______  /     \\__  \\\\   __\\  |  \\ ");
                System.out.println(" \\     /|  |/    /  / __ \\|  | \\/ /_/ | /_____/ |  Y Y  \\/ __ \\|  | |   Y  \\");
                System.out.println("  \\/\\_/ |__/_____ \\(____  /__|  \\____ |         |__|_|  (____  /__| |___|  /");
                System.out.println("                 \\/     \\/           \\/               \\/     \\/          \\/ ");
            }
            if (Objects.equals(modelName, "nous-hermes2")) {
                System.out.println("  __________________ .______________ __________________.______________.____________           ________  .___  __________________  ____ ___  _________ _________.___________    _______     ");
                System.out.println(" /   _____/\\_   ___ \\|   \\_   _____/ \\      \\__    ___/|   \\_   _____/|   \\_   ___ \\          \\______ \\ |   |/   _____/\\_   ___ \\|    |   \\/   _____//   _____/|   \\_____  \\   \\      \\    ");
                System.out.println(" \\_____  \\ /    \\  \\/|   ||    __)_  /   |   \\|    |   |   ||    __)  |   /    \\  \\/   ______  |    |  \\|   |\\_____  \\ /    \\  \\/|    |   /\\_____  \\ \\_____  \\ |   |/   |   \\  /   |   \\   ");
                System.out.println(" /        \\\\     \\___|   ||        \\/    |    \\    |   |   ||     \\   |   \\     \\____ /_____/  |    `   \\   |/        \\\\     \\___|    |  / /        \\/        \\|   /    |    \\/    |    \\  ");
                System.out.println("/_______  / \\______  /___/_______  /\\____|__  /____|   |___|\\___  /   |___|\\______  /         /_______  /___/_______  / \\______  /______/ /_______  /_______  /|___\\_______  /\\____|__  / ");
                System.out.println("        \\/         \\/            \\/         \\/                  \\/                \\/                  \\/            \\/         \\/                 \\/        \\/             \\/         \\/  ");
                System.out.println(" __________________________________________________________________________________________________________________________________________________________________________________________ ");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

                System.out.println();

                System.out.println("                                     .__                                       ________  ");
                System.out.println("  ____   ____  __ __  ______         |  |__   ___________  _____   ____   _____\\_____  \\ ");
                System.out.println(" /    \\ /  _ \\|  |  \\/  ___/  ______ |  |  \\_/ __ \\_  __ \\/     \\_/ __ \\ /  ___//  ____/ ");
                System.out.println("|   |  (  <_> )  |  /\\___ \\  /_____/ |   Y  \\  ___/|  | \\/  Y Y  \\  ___/ \\___ \\/       \\ ");
                System.out.println("|___|  /\\____/|____/____  >         |___|  /\\___  >__|  |__|_|  /\\___  >____  >_______ \\");
                System.out.println("     \\/                  \\/               \\/     \\/            \\/     \\/     \\/        \\/ ");
            }
            if (Objects.equals(modelName, "medllama2:7b")) {
                System.out.println("   _____  ___________________  .____________     _____  .____                 _____   ________  ________  ___________.____       _________ ");
                System.out.println("  /     \\ \\_   _____/\\______ \\ |   \\_   ___ \\   /  _  \\ |    |               /     \\  \\_____  \\ \\______ \\ \\_   _____/|    |     /   _____/ ");
                System.out.println(" /  \\ /  \\ |    __)_  |    |  \\|   /    \\  \\/  /  /_\\  \\|    |      ______  /  \\ /  \\  /   |   \\ |    |  \\ |    __)_ |    |     \\_____  \\  ");
                System.out.println("/    Y    \\|        \\ |    `   \\   \\     \\____/    |    \\    |___  /_____/ /    Y    \\/    |    \\|    `   \\|        \\|    |___  /        \\ ");
                System.out.println("\\____|__  /_______  //_______  /___|\\______  /\\____|__  /_______ \\         \\____|__  /\\_______  /_______  /_______  /|_______ \\/_______  / ");
                System.out.println("        \\/        \\/         \\/            \\/         \\/        \\/                 \\/         \\/        \\/        \\/         \\/        \\/  ");
                System.out.println(" __________________________________________________________________________________________________________________________________________ ");
                System.out.println("/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/");

                System.out.println();

                System.out.println("                   .___.__  .__                         ________  ");
                System.out.println("  _____   ____   __| _/|  | |  | _____    _____ _____   \\_____  \\ ");
                System.out.println(" /     \\_/ __ \\ / __ | |  | |  | \\__  \\  /     \\\\__  \\   /  ____/ ");
                System.out.println("|  Y Y  \\  ___// /_/ | |  |_|  |__/ __ \\|  Y Y  \\/ __ \\_/       \\ ");
                System.out.println("|__|_|  /\\___  >____ | |____/____(____  /__|_|  (____  /\\_______ \\");
                System.out.println("      \\/     \\/     \\/                \\/      \\/     \\/         \\/");
            }
            if(Objects.equals(modelName, "meditron")){
                System.out.println("                   .___.__  __                        ");
                System.out.println("  _____   ____   __| _/|__|/  |________  ____   ____  ");
                System.out.println(" /     \\_/ __ \\ / __ | |  \\   __\\_  __ \\/  _ \\ /    \\ ");
                System.out.println("|  Y Y  \\  ___// /_/ | |  ||  |  |  | \\(  <_> )   |  \\");
                System.out.println("|__|_|  /\\___  >____ | |__||__|  |__|   \\____/|___|  /");
                System.out.println("      \\/     \\/     \\/                             \\/ ");
            }
        }
    }
