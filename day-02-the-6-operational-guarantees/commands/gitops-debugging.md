# GitOps Debugging

## Check Argo CD Application Status

    kubectl get applications.argoproj.io -A

Used to inspect:
- synchronization status
- reconciliation health
- deployment consistency

---

## Describe an Application

    kubectl describe application <app-name> -n argocd

Useful for:
- sync failures
- drift analysis
- reconciliation visibility
- deployment history

---

## Check Reconciliation Events

    kubectl get events -n argocd

Helps identify:
- synchronization problems
- failed reconciliation
- operational drift

---

## Inspect GitOps Controller Logs

    kubectl logs deployment/argocd-application-controller -n argocd

Used to debug:
- reconciliation behavior
- sync errors
- deployment coordination

---

## Compare Desired vs Live State

    argocd app diff <app-name>

Useful for:
- drift detection
- configuration inconsistency
- operational divergence

---

## Force Application Sync

    argocd app sync <app-name>

Used to:
- restore declarative state
- reconcile operational drift
- recover environment consistency

---

# Key Insight

GitOps debugging focuses on preserving trusted declarative operational state through continuous reconciliation behavior.
