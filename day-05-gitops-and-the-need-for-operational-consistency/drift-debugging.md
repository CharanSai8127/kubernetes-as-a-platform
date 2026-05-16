# Drift Debugging Commands

argocd app list

argocd app diff backend-production

kubectl diff -k overlays/production

kubectl describe deployment backend

kubectl get deployment backend -o yaml

kubectl get all -A

argocd app sync backend-production
