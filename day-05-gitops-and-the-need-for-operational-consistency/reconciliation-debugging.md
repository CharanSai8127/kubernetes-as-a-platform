# Reconciliation Debugging Commands

kubectl get all -A

kubectl diff -f deployment.yaml

kubectl get events --sort-by=.metadata.creationTimestamp

kubectl describe deployment backend

kubectl get pods -w

kubectl logs deployment/argocd-application-controller -n argocd

kubectl get applications -n argocd
