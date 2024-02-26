# syntax=docker/dockerfile:1
FROM --platform=linux/amd64 ollama/ollama:latest
RUN /bin/sh -c "/bin/ollama serve & sleep 1 && ollama pull mistral"
ENTRYPOINT ["/bin/ollama"]
CMD ["serve"]