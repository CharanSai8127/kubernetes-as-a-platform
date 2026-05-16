# ApplicationSet Debugging Commands

kubectl get applicationsets -n argocd

kubectl describe applicationset platform-environments -n argocd

kubectl get applications -n argocd

kubectl logs deployment/argocd-applicationset-controller -n argocd

tree environments/

argocd repo list

kubectl get applications -n argocd -w
