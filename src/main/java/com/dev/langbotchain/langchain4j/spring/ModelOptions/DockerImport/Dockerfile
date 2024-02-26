# syntax=docker/dockerfile:1
FROM --platform=linux/amd64 ollama/ollama:latest
RUN /bin/sh -c "/bin/ollama serve & sleep 1 && ollama pull gemma:instruct"
ENTRYPOINT ["/bin/ollama"]
CMD ["serve"]

# Setting image name and tag
# This line sets the name of the image to 'deepseek-coder'
# You can also include the tag if needed like 'deepseek-coder:latest'
# This line is a comment and is not executed as a Docker instruction