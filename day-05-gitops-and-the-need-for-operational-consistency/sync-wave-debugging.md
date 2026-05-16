# Sync Wave Debugging Commands

kubectl get deployment backend -o yaml

kubectl describe deployment backend

kubectl get jobs

kubectl logs job/database-migration

argocd app get backend-production

kubectl get pods -w

kubectl get events --sort-by=.metadata.creationTimestamp
