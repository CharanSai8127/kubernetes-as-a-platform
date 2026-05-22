# Manual Drift Caused Outage

Infrastructure drift frequently begins through:
- manual runtime modification.

Over time:
- infrastructure behavior diverges from declared state.

---

# Failure Flow

Terraform infrastructure deployed
→ Manual console modification introduced
→ Runtime infrastructure diverges
→ New deployment triggered
→ Environment behaves unpredictably
→ Operational instability occurs

---

# Common Examples

Examples include:
- modified security groups
- deleted IAM permissions
- route table inconsistencies
- and unmanaged resources.

---

# Operational Consequences

Infrastructure drift may create:
- failed deployments
- connectivity instability
- scaling issues
- and runtime unpredictability.

---

# Platform Engineering Perspective

Infrastructure consistency requires:
- controlled operational mutation.

---

# Key Insight

Manual infrastructure drift eventually creates operational instability.
