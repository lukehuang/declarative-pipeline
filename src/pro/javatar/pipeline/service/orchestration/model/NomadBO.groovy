package pro.javatar.pipeline.service.orchestration.model

import pro.javatar.pipeline.service.vcs.model.VcsRepo

import java.time.Period

class NomadBO {

    String env

    String url

    Period period

    VcsRepo vcsRepo

    String getEnv() {
        return env
    }

    void setEnv(String env) {
        this.env = env
    }

    NomadBO withEnv(String env) {
        setEnv(env)
        return this
    }

    String getUrl() {
        return url
    }

    void setUrl(String url) {
        this.url = url
    }

    NomadBO withUrl(String url) {
        setUrl(url)
        return this
    }

    Period getPeriod() {
        return period
    }

    void setPeriod(Period period) {
        this.period = period
    }

    NomadBO withPeriod(Period period) {
        setPeriod(period)
        return this
    }

    VcsRepo getVcsRepo() {
        return vcsRepo
    }

    void setVcsRepo(VcsRepo vcsRepo) {
        this.vcsRepo = vcsRepo
    }

    NomadBO withVcsRepo(VcsRepo vcsRepo) {
        setVcsRepo(vcsRepo)
        return this
    }

    @Override
    public String toString() {
        return "NomadBO{" +
                "env='" + env + '\'' +
                ", url='" + url + '\'' +
                ", period=" + period +
                ", vcsRepo=" + vcsRepo +
                '}';
    }
}