# Rollout Debugging

## Check Deployment Status

    kubectl rollout status deployment/<deployment-name>

Used to monitor:
- rollout progression
- deployment stability
- workload replacement behavior

---

## View Rollout History

    kubectl rollout history deployment/<deployment-name>

Useful for:
- deployment revisions
- rollback visibility
- operational recovery coordination

---

## Roll Back a Deployment

    kubectl rollout undo deployment/<deployment-name>

Used for:
- recovery coordination
- deployment reversal
- restoring stable workload behavior

---

## Describe Deployment

    kubectl describe deployment <deployment-name>

Helps identify:
- rollout failures
- unavailable replicas
- scheduling issues
- readiness instability

---

## Check ReplicaSets

    kubectl get rs

Useful for:
- deployment revision tracking
- rollback analysis
- rollout coordination

---

## Inspect Pod Events

    kubectl describe pod <pod-name>

Used to debug:
- CrashLoopBackOff
- image pull failures
- readiness issues
- rollout instability

---

# Key Insight

Rollout debugging focuses on preserving workload continuity and deployment stability during operational transitions.
