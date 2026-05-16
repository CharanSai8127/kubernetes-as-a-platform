# Argo CD Debugging Commands

kubectl get applications -n argocd

kubectl describe application backend-production -n argocd

argocd app get backend-production

argocd app sync backend-production

kubectl logs deployment/argocd-application-controller -n argocd

kubectl logs deployment/argocd-repo-server -n argocd

argocd app list

kubectl get events -n argocd --sort-by=.metadata.creationTimestamp
